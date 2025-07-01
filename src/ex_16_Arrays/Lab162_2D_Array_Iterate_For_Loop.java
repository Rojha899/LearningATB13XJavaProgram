package ex_16_Arrays;

public class Lab162_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // 3x3 matrix
        // Row -> 3
        // Col -> 3

        // 1,2,3
        // 4,5,6
        // 7,8,9
        System.out.println(matrix.length);

        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " | "); // this prints 3x3 above given matrix
                //System.out.println("*"); // this print 3x3 star matrix
            }
            System.out.println();

        }
    }
}
