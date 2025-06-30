package ex_13_Functions;

import java.util.Scanner;

public class Lab_Test_P14 {
    public static void main(String[] args) {
        //Create a program to print various star patterns using nested loops.
        //**Requirements:**
        //- Print a right triangle pattern of stars
        //- Print a pyramid pattern of stars
        //- Use nested loops for pattern generation
        //- Make patterns scalable based on input size

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows = scanner.nextInt();

        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= rows; i++){ // outer for loop
            for (int j = 1; j <= i; j++){ // inner for loop
                System.out.print("* "); // remove ln (from println) so the stars are printed in row
            }
            System.out.println();
        }

        // Print pyramid pattern

        System.out.println("\nPyramid Pattern:");
        for (int i = 1; i <= rows; i++){
          for (int space = 1; space <= rows - i; space++){
              System.out.print("  ");
            }
          for (int star = 1; star <= (2 * i -1); star++){
              System.out.print("* ");
          }
            System.out.println();
        }

    }
}
