package com.wipro.java.tictactoe;

import java.util.Scanner;

public class TicTacToe {

    private static final char EMPTY = ' ';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';
    private static char[][] board = new char[3][3]; // The game board
    private static char currentPlayer = PLAYER_X; // Starting player

    // Method to initialize the Board
    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    // Method to display the board
    public static void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Method to check if the game has a winner
    public static boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer)
                return true; // Row win
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)
                return true; // Column win
        }
        // Check diagonals
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer)
            return true; // Diagonal win
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer)
            return true; // Diagonal win

        return false;
    }

    // Method to check if the board is full (a draw)
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY)
                    return false; // Found an empty space
            }
        }
        return true; // No empty space, draw
    }

    // Method to change players
    public static void switchPlayer() {
        currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
    }

    // Method to take input from the player
    public static boolean takeTurn(Scanner scanner) {
        int row, col;
        while (true) {
            System.out.println("Player " + currentPlayer + "'s turn");
            System.out.print("Enter row (0, 1, 2): ");
            row = scanner.nextInt();
            System.out.print("Enter column (0, 1, 2): ");
            col = scanner.nextInt();

            // Validate the move
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY) {
                board[row][col] = currentPlayer;
                return true;
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
    }

    // Main method to run the game
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        initializeBoard();
        displayBoard();

        while (true) {
            takeTurn(scanner);
            displayBoard();

            // Check for a winner
            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            // Check for a draw
            if (isBoardFull()) {
                System.out.println("It's a draw!");
                break;
            }

            // Switch players
            switchPlayer();
        }

        scanner.close();
    }
}
