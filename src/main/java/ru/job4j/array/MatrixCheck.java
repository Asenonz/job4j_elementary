package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 1; cell < board.length; cell++) {
            if (board[row][0] != board[row][cell]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int cell = 1; cell < board.length; cell++) {
            if (board[0][column] != board[cell][column]) {
                result = false;
                break;
            }
        }
        return result;
    }
}