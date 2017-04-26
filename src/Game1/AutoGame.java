/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game1;

/**
 *
 * @author osku0
 */
public class AutoGame {
    static int auto1 = 5;
    static int auto2 = 10;
    static int auto3 = 25;
    static int auto4 = 50;
    static int auto5 = 100;
    
    public static int Auto(double auto) {
        if (auto == 1) {
            return auto1;
        } else if (auto == 2) {
            return auto2;
        } else if (auto == 3) {
            return auto3;
        } else if (auto == 4) {
            return auto4;
        } else if (auto == 5) {
            return auto5;
        }
        return 0;
    }
}
