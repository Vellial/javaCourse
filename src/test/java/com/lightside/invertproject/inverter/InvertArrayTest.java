package com.lightside.invertproject.inverter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for InvertArray class.
 */
public class InvertArrayTest {

    private InvertArray invert;

    @Before
    public void setUp() {
        invert = new InvertArray();
    }

    @Test
    public void inverseIntArrTest() {
        Integer[] intReversedArray = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        Integer[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        invert.inverse(intArray);
        assertArrayEquals(intReversedArray, intArray);
    }

    @Test
    public void inverseCharArrTest() {
        Character[] charReversedArray = {'e', 'd', 'c', 'b', 'a'};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        invert.inverse(charArray);
        assertArrayEquals(charReversedArray, charArray);
    }

    @Test
    public void inverseStringArrTest() {
        String[] stringReversedArray = {"abc", "def", "ghi", "jkl", "mno"};
        String[] stringArray = {"mno", "jkl", "ghi", "def", "abc",};
        invert.inverse(stringArray);
        assertArrayEquals(stringReversedArray, stringArray);
    }

    @Test
    public void arrayToInverseSetTest() {
        Integer[] intArr = {1, 2, 3, 4, 5, 6};
        ArrayToInverse arrayToInverse = new ArrayToInverse<Integer>();
        arrayToInverse.setArr(intArr);
        assertArrayEquals(arrayToInverse.getArr(), intArr);
    }

    @Test
    public void arrayToInverseGetTest() {
        Integer[] intArr = {1, 2, 3, 4, 5, 6};
        ArrayToInverse arrayToInverse = new ArrayToInverse<Integer>(intArr);
        assertArrayEquals(arrayToInverse.getArr(), intArr);
    }

}
