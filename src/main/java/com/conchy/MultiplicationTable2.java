package com.conchy;

public class MultiplicationTable2 {
    
    public static void printMultiplicationTable2(int n) {
        for (int i = 1; i <= 10; i++) {
            int result = n * i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }

    public static void main(String[] args) {
        int n = 7;
        printMultiplicationTable2(n);
    }
};
