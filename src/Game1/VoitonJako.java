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
public class VoitonJako {

    public static double Voitto() {

        return 0;
    }
    
    public static double Taso1 (int num2, int num5, int num8){
        if (num2 == num5 && num5 == num8 && num8 == 5) {
            System.out.println("L1 x5");
        } else if (num2 == num5 && num5 == num8) {
            System.out.println("L1 x3");
        } else if (num2 == num5 && num5 == 5) {
            System.out.println("L1 x3");
        } else if (num2 == num5) {
            System.out.println("L1 x2");
        }
        return 0;
    }
    
    public static double Taso2 (int num3, int num6, int num9){
        if (num3 == num6 && num6 == num9 && num9 == 5) {
            System.out.println("L2 x5");
        } else if (num3 == num6 && num6 == num9) {
            System.out.println("L2 x3");
        } else if (num3 == num6 && num6 == 5) {
            System.out.println("L2 x3");
        } else if (num3 == num6) {
            System.out.println("L2 x2");
        }
        return 0;
    }
    
    public static double Taso3 (int num1, int num4, int num7){
        if (num1 == num4 && num4 == num7 && num7 == 5) {
            System.out.println("L3 x5");
        } else if (num1 == num4 && num4 == num7) {
            System.out.println("L3 x3");
        } else if (num1 == num4 && num4 == 5) {
            System.out.println("L3 x3");
        } else if (num1 == num4) {
            System.out.println("L3 x2");
        }
        return 0;
    }
    
    public static double Taso4 (int num1, int num5, int num9){
        if (num1 == num5 && num5 == num9 && num9 == 5) {
            System.out.println("L4 x5");
        } else if (num1 == num5 && num5 == num9) {
            System.out.println("L4 x3");
        } else if (num1 == num5 && num5 == 5) {
            System.out.println("L4 x3");
        } else if (num1 == num5) {
            System.out.println("L4 x2");
        }
        return 0;
    }
    
    public static double Taso5 (int num3, int num5, int num7){
        if (num3 == num5 && num5 == num7 && num7 == 5) {
            System.out.println("L5 x5");
        } else if (num3 == num5 && num5 == num7) {
            System.out.println("L5 x3");
        } else if (num3 == num5 && num5 == 5) {
            System.out.println("L5 x3");
        } else if (num3 == num5) {
            System.out.println("L5 x2");
        }
        return 0;
    }
}
