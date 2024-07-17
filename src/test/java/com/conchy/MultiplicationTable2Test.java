package com.conchy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;


public class MultiplicationTable2Test {

    @Test
    public void testMultiplicationTable2() {
        int n = 7;
        int[] expected = {7, 14, 21, 28, 35, 42, 49, 56, 63, 70};
        assertArrayEquals(expected, generateMultiplicationTable2Array(n));
    }

    private int[] generateMultiplicationTable2Array(int n) {
        int[] result = new int[10];
        for (int i = 1; i <= 10; i++) {
            result[i - 1] = n * i;
        }
        return result;
    }
};
