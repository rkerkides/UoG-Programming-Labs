package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(addUpArray(array, 0, array.length - 2));
        System.out.println(fibonacciNumber(12));
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
}