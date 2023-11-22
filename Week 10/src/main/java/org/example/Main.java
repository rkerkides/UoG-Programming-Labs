package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(addUpArray(array, 0, array.length - 2));
        System.out.println(fibonacciNumber(12));
        printBinarySequences(3, 2, "", 0);
    }

    public static int addUpArray(int[] array, int i, int j) {
        if (i == j) {
            return array[i];
        }
        return array[i] + addUpArray(array, i + 1, j);
    }

    public static int fibonacciNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    public static void printBinarySequences(int n, int m, String sequence, int numOnes) {
        if (sequence.length() == n) {
            if (numOnes == m) {
                System.out.println(sequence);
            }
            return;
        }

        if (numOnes < m) {
            printBinarySequences(n, m, sequence + "1", numOnes + 1);
        }

        printBinarySequences(n, m, sequence + "0", numOnes);
    }
}
