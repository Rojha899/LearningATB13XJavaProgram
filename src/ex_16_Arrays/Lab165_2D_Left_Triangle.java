package ex_16_Arrays;

public class Lab165_2D_Left_Triangle {
    public static void main(String[] args) {
        // Print left triangle -pattern given
        // n = 3
        // * * *
        // * *
        // *

        int n = 3;
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
