package ex_16_Arrays;

import org.w3c.dom.ls.LSOutput;

public class Lab159_2D {
    public static void main(String[] args) {
        // 1,2,3
        // 4,5,6
        // 7,8,9
        // Way-1 to represent given 2D matrix
        int[][] array_2d_old = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // Way-2 to represent 2D-matrix for given values
        // 10,20
        // 30,40
        // 50,60

        int[][] array;
        array = new int[][] {
                {10, 20},
                {30, 40},
                {50, 60}
        };

        int[][] array_2d = new int[3][3];
        array_2d[0][0] = 1;
        array_2d[0][1] = 2;
        array_2d[0][2] = 3;

        array_2d[1][0] = 4;
        array_2d[1][1] = 5;
        array_2d[1][2] = 6;

        array_2d[2][0] = 7;
        array_2d[2][1] = 8;
        array_2d[2][2] = 9;

    }

}
