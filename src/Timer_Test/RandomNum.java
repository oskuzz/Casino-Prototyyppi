/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Timer_Test;

import java.util.Random;

/**
 *
 * @author osku0
 */
public class RandomNum {

    public static int num1() {
        int START = 1;
        int END = 9;
        Random random = new Random();
        int number = showRandomInteger(START, END, random);

        return (number);
    }

    private static int showRandomInteger(int aStart, int aEnd, Random aRandom) {
        long range = (long) aEnd - (long) aStart + 1;
        long fraction = (long) (range * aRandom.nextDouble());
        int randomNumber = (int) (fraction + aStart);
        return (randomNumber);
    }
}
