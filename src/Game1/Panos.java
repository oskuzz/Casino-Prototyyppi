/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game1;

/**
 *
 * @author s1601396
 */
public class Panos {

    static double panos1 = 0.10;
    static double panos2 = 0.20;
    static double panos3 = 0.50;
    static double panos4 = 1.00;
    static double panos5 = 2.00;
    static double panos6 = 5.00;
    static double panos7 = 10.00;
    static double panos8 = 25.00;
    static double panos9 = 50.00;

    public static double panos(double panos) {

        if (panos == 1) {
            return panos1;
        } else if (panos == 2) {
            return panos2;
        } else if (panos == 3) {
            return panos3;
        } else if (panos == 4) {
            return panos4;
        } else if (panos == 5) {
            return panos5;
        } else if (panos == 6) {
            return panos6;
        } else if (panos == 7) {
            return panos7;
        } else if (panos == 8) {
            return panos8;
        } else if (panos == 9) {

            return panos9;
        }
        return 0;
    }

}
