package com.andrewd;
import java.util.Arrays;

class MatrixOperations {
    private int[][] matrix;

    // constructor for initalization
    public MatrixOperations(int[][] matrix)
    {
        // validate matrix
        if (!(matrix.length > 1 && matrix[0].length > 1)) throw new IllegalArgumentException("Matrix contains less than 2 rows/cols");
        for (int[] row: matrix) { if(row.length != matrix[0].length) throw new IllegalArgumentException("Matrix isn't rectangular"); }

        this.matrix = matrix;
    }

    // column swapper
    public int[][] swapColumns() {
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];

            int[] position_of_min = positionOfMinValues()[0]; // [x, y]
            int[][] position_of_max_elements = positionOfMaxValues();
            int[] position_of_max = position_of_max_elements[position_of_max_elements.length-1]; // [x, y]

            matrix[i] = swapElementsInRow(row, position_of_min[0], position_of_max[0]);
        }

        return matrix;
    }

    // just a helper method
    private int[] swapElementsInRow(int[] row, int index_1, int index_2) {
        int first_el = row[index_1];
        int second_el = row[index_2];

        row[index_1] = second_el;
        row[index_2] = first_el;

        return row;
    }

    private int[][] pushElementToArray(int[][] old_arr, int[] appended) {
        int[][] tmp = Arrays.copyOf(old_arr, old_arr.length + 1);
        tmp[tmp.length - 1] = appended;
        return tmp;
    }

    // returns array (x, y) of largest values position
    public int[][] positionOfMaxValues() {
        int biggest_value = Integer.MIN_VALUE;
        int[][] position = {};

        for (int y = 0; y < matrix.length; y++) {
            int[] row = matrix[y];

            for (int x = 0; x < row.length; x++) {
                int el = row[x];
                if (el < biggest_value) {
                    continue;
                } else if (el == biggest_value) { // update position array
                    position = pushElementToArray( position, new int[] {x, y} );
                } else {
                    biggest_value = el;
                    position = new int[][] {
                            new int[]{x, y}
                    };
                }
            }
        }

        Arrays.sort(position, (a, b) -> Double.compare(a[0], b[0]));
        return position;
    }

    public int[][] positionOfMinValues() {
        int smallest_value = Integer.MAX_VALUE;
        int[][] position = {};

        for (int y = 0; y < matrix.length; y++) {
            int[] row = matrix[y];

            for (int x = 0; x < row.length; x++) {
                int el = row[x];
                if (el > smallest_value) {
                    continue;
                } else if (el == smallest_value) { // update position array
                    position = pushElementToArray( position, new int[] {x, y} );
                } else {
                    smallest_value = el;
                    position = new int[][] {
                            new int[]{x, y}
                    };
                }
            }
        }

        Arrays.sort(position, (a, b) -> Double.compare(a[0], b[0]));
        return position;
    }

    public int[][] toArray() {
        int height = matrix.length;
        int width = matrix[0].length;
        int[][] formated_matrix_template = new int[height*width][3];

        for (int y = 0; y < matrix.length; y++) {
            int[] row = matrix[y];
            for (int x = 0; x < row.length; x++) {
                int value = row[x];
                int element_number_in_flatten_matrix = width*y + x;

                formated_matrix_template[element_number_in_flatten_matrix] = new int[] {x, y, value};
            }
        }
        return formated_matrix_template;
    }
}