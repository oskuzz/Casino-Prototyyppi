/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Casino.CasinoFirstPage;
import java.sql.SQLException;

/**
 *
 * @author osku0
 */
public class DBBank {

    static double Kassa = 0;
    static String uname;

    public static void UserName(String uName) {
        CasinoFirstPage CFP = new CasinoFirstPage();
        uname = uName;
        CFP.profile(uName);
        CFP.toProfile();
    }

    public static void bank(String uName, double kassa) {
        uname = uName;
        Kassa = kassa;

    }

    public static void GameBank() {
        Game1.Game1.kassa(Kassa);

    }

    public static void getGame1Bank(double kassa) {
        Kassa = kassa;
        CFPBank();
    }

    public static void CFPBank() {
        CasinoFirstPage.bankBalance(Kassa);
    }
    
    public static void updateBank2(double kassa) throws SQLException{
        kassa = Kassa + kassa;
        updateBank(kassa);
        getGame1Bank(kassa);
    }
    
    public static void updateBank(double kassa) throws SQLException {
        Kassa = kassa;
        DBConnections.updateMoneyBalance(uname, kassa);
    }
}
