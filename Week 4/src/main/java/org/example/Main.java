package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        double[] arr = new double[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = random.nextDouble(1);
        }
        System.out.println(averageOfDoubleArray(arr));
        /*int[] arr2 = new int[100];
        for (int i = 0; i < 100; i++) {
            arr2[i] = i;
        }
        int[] occurrences = findAllOccurrences(arr2, 50);
        for (int i = 0; i < occurrences.length; i++) {
            System.out.println(occurrences[i]);
        }
        System.out.println(findFirstOccurrence(arr2, 50));
        for (int i = 0; i < 100; i++) {
            arr2[i] = 50;
        }
        System.out.println(findLastOccurrence(arr2, 50));
        occurrences = findAllOccurrences(arr2, 50);
        for (int i = 0; i < occurrences.length; i++) {
            System.out.println(occurrences[i]);
        }*/

    }

    public static double averageOfDoubleArray(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / (double) arr.length;
    }

    public static int findFirstOccurrence(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) return i;
        }
        return -1;
    }

    public static int findLastOccurrence(int[] arr, int toFind) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == toFind) return i;
        }
        return -1;
    }

    public static int[] findAllOccurrences(int[] arr, int toFind) {
        int[] occurrences = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            occurrences[i] = -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                occurrences[i] = i;
            }
        };
        return occurrences;
    }
}