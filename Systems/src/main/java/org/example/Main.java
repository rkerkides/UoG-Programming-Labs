package org.example;

public class Main {
    public static void main(String[] args) {
        // Developer acceptance test data
        int n = 12;
        int[] X = new int[n];
        X[0] = 3;
        X[1] = -6;
        X[2] = 27;
        X[3] = 101;
        X[4] = 50;
        X[5] = 0;
        X[6] = -20;
        X[7] = -21;
        X[8] = 19;
        X[9] = 6;
        X[10] = 4;
        X[11] = -10;

        int negsum = 0;
        int pzcount = 0;
        int oddcount = 0;
        boolean overflow = false;

        for (int i = 0; i < n; i++) {
            if (X[i] < 0) {
                // Check for potential overflow before performing the addition
                int tempSum = negsum + X[i];
                // Overflow occurs if both operands are negative and the result is non-negative
                if (negsum < 0 && X[i] < 0 && tempSum >= 0) {
                    overflow = true;
                }
                negsum = tempSum;
            } else {
                pzcount++;
                // Check if the number is positive (greater than 0) and odd
                if (X[i] > 0 && X[i] % 2 == 1) {
                    oddcount++;
                }
            }
        }
    }
}
