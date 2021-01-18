package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        for (row = 0; row < board.length; row++) {
                if (board[row][row] == 'X') {
                    result = true;
                    break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
                if (board[i][i] == 'X') {
                    column = i;
                    result = true;
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

}
