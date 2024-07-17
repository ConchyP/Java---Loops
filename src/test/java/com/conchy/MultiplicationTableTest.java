package com.conchy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MultiplicationTableTest {

    @Test
    public void testMultiplicationTable() {
        int n = 5;
        int[] expected = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        assertArrayEquals(expected, generateMultiplicationTableArray(n));
    }

    private int[] generateMultiplicationTableArray(int n) {
        int[] result = new int[10];
        for (int i = 1; i <= 10; i++) {
            result[i - 1] = n * i;
        }
        return result;
    }
};



