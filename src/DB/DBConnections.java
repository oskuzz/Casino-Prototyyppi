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

    public DBConnections(String urlToDataBase) throws ClassNotFoundException, SQLException {

        String driver = "net.ucanaccess.jdbc.UcanaccessDriver";
        Class.forName(driver);
        conn = DriverManager.getConnection("jdbc:ucanaccess://" + urlToDataBase);
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
            Statement sta = conn.createStatement();

            int s = sta.executeUpdate("INSERT INTO Login (ID, eNimi, sNimi, Salasana) VALUES (' " + ID + " ',' " + eName + " ',' " + sName + " ', ' " + password + " ');");
            System.out.println("Inserted into database");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public String getDatabase(String uName, String Password) throws ClassNotFoundException, SQLException {

        String userName, Salasana;

        String query = "SELECT ID, Salasana FROM Login";
        try {
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery(query);
            while (rs.next()) {
                String UserName = rs.getString(1);
                String password = rs.getString(2);

                userName = " " + uName + " ";
                Salasana = " " + Password + " ";

                if (userName.equals(UserName) && (Salasana.equals(password))) {
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

        String query = "SELECT Kassa FROM Login WHERE ID = (' " + uName + " ')";
        System.out.println(uName);
        Statement sta = null;
        try {
            sta = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnections.class.getName()).log(Level.SEVERE, null, ex);
        }
        ResultSet rs = sta.executeQuery(query);
        while (rs.next()) {
            int kassa = rs.getInt(1);
            System.out.println(kassa);

            CasinoFirstPage.bankBalance(kassa);
            
        }
        new CasinoFirstPage().setVisible(true);
        return "";
    }
}