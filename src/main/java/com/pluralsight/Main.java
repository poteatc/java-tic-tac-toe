package com.pluralsight;

import java.util.Scanner;

public class Main {
    static boolean[] board = new boolean[]{
            false, false, false,
            false, false, false,
            false, false, false
    };

    public static void main(String[] args) {
        System.out.println("Hello world!");
        //TODO : print the game intro
        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("""
                     |     |
                  1  |  2  |  3
                _____|_____|_____
                     |     |
                  4  |  5  |  6
                _____|_____|_____
                     |     |
                  7  |  8  |  9
                     |     |
                """);
        System.out.println("Please enter a piece on the board (1 - 9)");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();
        int choice = Integer.parseInt(input);

        if (choice <= 0 || choice > 9) {
            System.out.println("Please enter a valid number...");
        } else {
            System.out.println(choice + " selected.");
            board[choice - 1] = true;
        }
        printBoard();
    }

    public static void printBoard() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == false) {
                System.out.println(i);
            } else {
                System.out.println("X");
            }
        }
    }
}