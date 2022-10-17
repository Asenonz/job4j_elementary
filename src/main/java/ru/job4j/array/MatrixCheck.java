package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        char symbol = 'X';
        for (int cell = 1; cell < board.length; cell++) {
            if (symbol != board[row][cell]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        char symbol = 'X';
        for (int cell = 1; cell < board.length; cell++) {
            if (symbol != board[cell][column]) {
                result = false;
                break;
            }
        }
        return result;
    }
}