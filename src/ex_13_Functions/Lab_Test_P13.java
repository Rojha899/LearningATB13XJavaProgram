package ex_13_Functions;

import java.util.Scanner;

public class Lab_Test_P13 {
    public static void main(String[] args) {
        // Write a program to print multiplication tables using nested loops.
        //**Requirements:**
        //- Print multiplication tables for numbers 1 to 5
        //- Each table should show multiplications from 1 to 10
        //- Use nested for loops
        //- Format output clearly

        // Outer loop for 1 to 5 numbers
        for (int i = 1; i<=5; i++){
            System.out.println("Multiplication table of " +i);

            // Inner loop for multiplying 1 to 10
            for (int j = 1; j <= 10; j++){
                System.out.println(i + " x " +j+ " = " + (i * j)); // (i x j = (i*j) -> 2x1=2)
            }
            System.out.println();
        }
    }
}
