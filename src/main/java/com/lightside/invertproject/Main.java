package com.lightside.invertproject;

import com.lightside.invertproject.inverter.ArrayToInverse;
import com.lightside.invertproject.inverter.InvertArray;

import java.util.Arrays;

/**
 * com.lightside.invertproject.inverter.Main class of the program
 */
public final class Main {

    private static final Integer[] ARR = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final Character[] ARRCHAR = {'a', 'b', 'c', 'd', 'e'};

    /**
     * com.lightside.invertproject.inverter.Main method
     * @param args string args
     */
    public static void main(final String[] args) {
        try {
            ArrayToInverse<Integer> arrayToInverseInt = new ArrayToInverse<Integer>(ARR);
            ArrayToInverse<Character> arrayToInverseChar = new ArrayToInverse<Character>(ARRCHAR);
            InvertArray invert = new InvertArray();

            System.out.println(Arrays.toString(ARR));
            invert.inverse(arrayToInverseInt.getArr());
            System.out.println(Arrays.toString(ARR));

            System.out.println(Arrays.toString(ARRCHAR));
            invert.inverse(arrayToInverseChar.getArr());
            System.out.println(Arrays.toString(ARRCHAR));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
