package com.hiru.dsa.java.PRACTICE.matrix;

import java.util.Arrays;

public class BACKTRACKING_KnightBoardOutProbability {

    /**
     * On an n x n chessboard, a knight starts at the cell (row, column) and attempts to make exactly k moves. The rows and columns are 0-indexed, so the top-left cell is (0, 0), and the bottom-right cell is (n - 1, n - 1).
     *
     * A chess knight has eight possible moves it can make, as illustrated below. Each move is two cells in a cardinal direction, then one cell in an orthogonal direction.
     *
     * @param args
     */
    public static void main(String[] args) {
        int N = 8;
        int[][] board = new int[N][N];

        //-----
//        knightOffProbability(board, N, 1, 0, 3, 3, count);
//        System.out.println("k=1, i,j=3,3 " + (float) count.fff / (count.fff + count.sss));
//
//        //-----
//        knightOffProbability(board, N, 2, 0, 3, 3, count);
//        System.out.println("k=2, i,j=3,3 " + (float) count.fff / (count.fff + count.sss));
//        //-----
//        knightOffProbability(board, N, 4, 0, 3, 3, count);
//        System.out.println("k=4, i,j=3,3 " + (float) count.fff / (count.fff + count.sss));
//        //-----
//        knightOffProbability(board, N, 5, 0, 3, 3, count);
//        System.out.println("k=5, i,j=3,3 " + (float) count.fff / (count.fff + count.sss));

        //-----
        for (int[] arr : board)
            Arrays.fill(arr, 0);
        Counts count = new Counts();
        board[3][3] = 1;
        knightOffProbability(board, N, 15, 0, 3, 3, count);
        //System.out.println("k=15, i,j=3,3 " + (float) count.fff / (count.fff + count.sss));
        System.out.println("k=1, i,j=3,3 " + (float) count.fff / (count.fff + count.sss));


    }

    //============================================
    static class Counts {
        int sss = 0;
        int fff = 0;
    }

    //============================================

    /**
     * Number of moves: K
     * Chess int [][]
     * Termination condition:
     * 1. Success (moves == k && ONBOARD) ===>successCount
     * 2. fail (moves <= k && off the chess board)
     */
    // knightOffProbability(board, N-1, 5, 0,    3, 4, 0, 0)
    static void knightOffProbability(int board[][], int size, int kk,
                                     int k,
                                     int i, int j, Counts count) {
        // Base cases
        if (k == kk && i < size && j < size) {
            count.sss += 1;
            return;
        }
        //=== Loop condition ? Stuck in same loop for sucess ?
        tryOption(board, size, kk, k, i + 2, j + 1, count);
        tryOption(board, size, kk, k, i + 2, j - 1, count);
        tryOption(board, size, kk, k, i - 2, j + 1, count);
        tryOption(board, size, kk, k, i - 2, j - 1, count);

        tryOption(board, size, kk, k, i + 1, j + 2, count);
        tryOption(board, size, kk, k, i - 1, j + 2, count);
        tryOption(board, size, kk, k, i + 1, j - 2, count);
        tryOption(board, size, kk, k, i - 1, j - 2, count);
    }

    private static void tryOption(int board[][], int size, int kk,
                                  int k, int i, int j, Counts count) {
        // About to go off board..increment count for that move
        if (k <= kk && (i >= size || j >= size || i < 0 || j < 0)) {
            count.fff += 1;
        } else if (board[i][j] == 0) {
            // TRY and recurse
            board[i][j] = 1; // Mark visited
            knightOffProbability(board, size, kk, k + 1, i, j, count);
            board[i][j] = 0; // Backtrack
        }
    }
}
