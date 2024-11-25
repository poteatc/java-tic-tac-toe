package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean[] board = new boolean[]{
                false, false, false,
                false, false, false,
                false, false, false
        };

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
    }
}