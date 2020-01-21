package com.andrewd;

public class Main {

    public static void main(String[] args) {
        int[][] template = {
            {8, 5, 1, 4, 0, 7},
            {8, 8, 8, 1, 8, 6},
            {0, 1, 8, 2, 5, 3},
            {6, 2, 2, 9, 2, 8},
            {1, 9, 3, 8, 8, 5},
            {6, 9, 8, 5, 5, 2}
        };

        MatrixOperations matrix_op = new MatrixOperations(template);
        matrix_op.swapColumns(); // swapped 4 and 1 col

        int[][] formated_matrix = matrix_op.toArray();
    }
}
