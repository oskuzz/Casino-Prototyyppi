/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Casino.CasinoFirstPage;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnections {

    private String Login;
    private Connection conn;
    private double Kassa = 0;
    static private Connection con;
    private static int id;
    private static String Salasana;

    public DBConnections(String urlToDataBase) throws ClassNotFoundException, SQLException {

        String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:ucanaccess://" + urlToDataBase);
        con = conn;
        System.out.println("Connected");
    }

    public DBConnections() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ResultSet query(String SQL) throws SQLException {
        Statement stmt = conn.createStatement();
        ResultSet result = stmt.executeQuery(SQL);
        return result;
    }

    public int updateReturnID(String SQL) throws SQLException {
        Statement stmt = conn.createStatement();
        int id = -1;
        stmt.executeUpdate(SQL, Statement.RETURN_GENERATED_KEYS);
        ResultSet result = stmt.getGeneratedKeys();
        if (result.next()) {
            id = result.getInt(1);
        }
        return id;
    }

    public void writeToDataBase(String ID, String eName, String sName, String password) throws ClassNotFoundException, SQLException {
        try {
            Salasana = password;
            Statement sta = conn.createStatement();
            
            System.out.println(id);

            sta.executeUpdate("INSERT INTO Login (ID, uNimi, eNimi, sNimi, Salasana) VALUES ('" + (id = getID()) + "','" + ID + "','" + eName + "','" + sName + "', '" + password + "');");
            getProfile();
            System.out.println("Inserted into database");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public String getDatabase(String uName, String Password) throws ClassNotFoundException, SQLException {

        String query = "SELECT ID, uNimi, Salasana FROM Login";
        Salasana = Password;
        try {
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery(query);
            while (rs.next()) {
                String ID = rs.getString(1);
                String UserName = rs.getString(2);
                String password = rs.getString(3);
                id = Integer.parseInt(ID);

                if (uName.equals(UserName) && (Password.equals(password))) {
                    getProfile();
                    Login = "Jeah";
                    System.out.println("Jeah");
                    break;
                } else {
                    System.out.println("ouhNOh");
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(DBConnections.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        String Jeah = "Jeah";
        if (Login == null ? Jeah == null : Login.equals(Jeah)) {
            return ("Completed");
        } else {
            return ("");
        }

    }

    public String getMoneyBalanse(String uName) throws SQLException {

        String query = "SELECT Kassa FROM Login WHERE uNimi = ('" + uName + "')";
        Statement sta = null;
        try {
            sta = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnections.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = sta.executeQuery(query);
        while (rs.next()) {
            int kassa = rs.getInt(1);
            Kassa = kassa;
            DBBank.bank(uName, Kassa);
            CasinoFirstPage.bankBalance(kassa);
            new CasinoFirstPage().setVisible(true);
        }

        return "";
    }

    public static void updateMoneyBalance(String uName, double kassa) throws SQLException {
        try {
            Statement sta = con.createStatement();

            sta.executeUpdate("UPDATE Login SET Kassa = ('" + kassa + "') WHERE uNimi = ('" + uName + "');");
            System.out.println("Inserted into database");
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public int getID() throws SQLException {
        String query = "SELECT ID FROM Login ORDER BY ID DESC";

        Statement sta = con.createStatement();
        ResultSet rs = sta.executeQuery(query);
        while (rs.next()) {
            String ID = rs.getString(1);
            return Integer.parseInt(ID);
            
        }
        return 0;
    }

    public static void getProfile() throws SQLException {
        String query = "SELECT * FROM Login WHERE ID = '" + id + "'";
        Statement sta = con.createStatement();
        ResultSet rs = sta.executeQuery(query);
        while (rs.next()) {
            String uName = rs.getString(1);
            String eName = rs.getString(2);
            String sName = rs.getString(3);
            String Kassa3 = rs.getString(5);

            DBBank.getProfile(uName, eName, sName, Salasana, Double.parseDouble(Kassa3));
        }
    }

    public static void toProfile(String eName, String sName, String Password) {
        try {
            Statement sta = con.createStatement();

            sta.executeUpdate("UPDATE Login SET eNimi = ('" + eName + "'), sNimi = ('" + sName + "'), Salasana = ('" + Password + "') WHERE ID = ('" + id + "');");
            System.out.println("Inserted into database");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
