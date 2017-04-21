/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game1;

import java.util.Random;

/**
 *
 * @author s1601396
 */
public class NumeroidenArvonta {

    public static int num1() {
        int START = 1;
        int END = 9;
        Random random = new Random();
        int number = showRandomInteger(START, END, random);

        return (number);
    }

    public static int num2() {
        int START = 1;
        int END = 9;
        Random random = new Random();
        int number = showRandomInteger(START, END, random);

        return (number);
    }

    public static int num3() {
        int START = 1;
        int END = 9;
        Random random = new Random();
        int number = showRandomInteger(START, END, random);

        return (number);
    }

    public static int num4() {
        int START = 1;
        int END = 9;
        Random random = new Random();
        int number = showRandomInteger(START, END, random);

        return (number);
    }

    public static int num5() {
        int START = 1;
        int END = 9;
        Random random = new Random();
        int number = showRandomInteger(START, END, random);

        return (number);
    }

    public static int num6() {
        int START = 1;
        int END = 9;
        Random random = new Random();
        int number = showRandomInteger(START, END, random);

        return (number);
    }

    public static int num7() {
        int START = 1;
        int END = 9;
        Random random = new Random();
        int number = showRandomInteger(START, END, random);

        return (number);
    }

    public static int num8() {
        int START = 1;
        int END = 9;
        Random random = new Random();
        int number = showRandomInteger(START, END, random);

        return (number);
    }

    public static int num9() {
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
