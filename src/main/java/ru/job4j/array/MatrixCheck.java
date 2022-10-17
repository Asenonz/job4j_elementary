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

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        char symbol = 'X';
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == symbol) {
                if ((monoHorizontal(board, i) || monoVertical(board, i))) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}