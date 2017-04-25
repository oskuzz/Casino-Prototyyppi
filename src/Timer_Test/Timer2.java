/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timer_Test;

import java.awt.event.ActionEvent;
import Timer_Test.timer;
import java.util.Random;
/**
 *
 * @author osku0
 */
public class Timer2 {

    public final javax.swing.Timer ajastin;
    private int laskuri = 0;
    private static int num1 = 0;
    private static int num2 = 0;
    private static int num3 = 0;

    public Timer2() {
        timer timer = new timer();
        ajastin = new javax.swing.Timer(100, (ActionEvent e) -> {
            paivitanumero();
            int num1 = num1();
            int num2 = num2();
            int num3 = num3();
            timer.num1(num1);
            timer.num2(num2);
            timer.num3(num3);
        });
        ajastin.setInitialDelay(0);

        ajastin.start();
    }

    private void paivitanumero() {
        laskuri++;
        System.out.println(laskuri);
        if (laskuri == 20) {
            ajastin.stop();
        }
    }
    
    public static int num1() {
        int START = 1;
        int END = 9;
        Random random = new Random();
        int number = showRandomInteger(START, END, random);
        num1 = number;
        num2();
        return (number);
    }
    public static int num2(){
        num2 = num1;
        num3();
        return num2;
    }
    
    public static int num3(){
        num3 = num2;
        return num3;
    }

    private static int showRandomInteger(int aStart, int aEnd, Random aRandom) {
        long range = (long) aEnd - (long) aStart + 1;
        long fraction = (long) (range * aRandom.nextDouble());
        int randomNumber = (int) (fraction + aStart);
        return (randomNumber);
    }
}
