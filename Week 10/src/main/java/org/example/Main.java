package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(addUpArray(array, 0, array.length - 2));
    }

    public static int addUpArray(int[] array, int i, int j) {
        if (i == j) {
            return array[i];
        }
        return array[i] + addUpArray(array, i + 1, j);
    }
}