/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import Casino.CasinoFirstPage;

/**
 *
 * @author osku0
 */
public class DBBank {
    static double Kassa;
    
    public static void bank(double kassa){
        Kassa = kassa;
        System.out.println(Kassa);
    }
    
    public static void Game1Bank(){
        Game1.Game1.kassa(Kassa);
        
    }
    
    public static void getGame1Bank(double kassa){
        Kassa = kassa;
        CFPBank();
    }
    
    public static void CFPBank(){
        CasinoFirstPage.bankBalance(Kassa);
    }
}
