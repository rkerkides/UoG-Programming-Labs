package org.example;

import java.util.Scanner;

public class TicTacToe {
    private char[][] board;
    private boolean player1Turn;

    public TicTacToe() {
        this.board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        this.player1Turn = true;
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + "\t");
                if (3 - 1 == j) System.out.println();
            }
        }
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (player1Turn) {
                System.out.println("Player 1's turn");
            } else {
                System.out.println("Player 2's turn");
            }
            System.out.println("Enter row: ");
            int row = scanner.nextInt();
            System.out.println("Enter column: ");
            int column = scanner.nextInt();
            if (row < 0 || row > 2 || column < 0 || column > 2) {
                System.out.println("Invalid input");
                continue;
            }
            if (board[row][column] != ' ') {
                System.out.println("Invalid input");
                continue;
            }
            if (player1Turn) {
                board[row][column] = 'X';
                player1Turn = false;
            } else {
                board[row][column] = 'O';
                player1Turn = true;
            }
            printBoard();
        }
    }
}
