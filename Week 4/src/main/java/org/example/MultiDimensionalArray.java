package org.example;

public class MultiDimensionalArray {
    private int rows;
    private int columns;

    public MultiDimensionalArray(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public int[][] create2DArray() {
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int value = 1 + j - i;
                if (value < 0) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = value;
                }
            }
        }
        return arr;
    }

    public void printArray(int[][] arr) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + "\t");
                if (columns - 1 == j) System.out.println();
            }
        }
    }
}
