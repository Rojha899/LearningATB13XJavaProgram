package ex_13_Functions;

import java.util.Scanner;

public class Lab_Test_P6 {
    public static void main(String[] args) {
        // Write a program to check if a number is positive, negative, or zero.
        // **Requirements:**
        //- Read an integer from user input
        //- Use if-else statements to classify the number
        //- Print appropriate message for each case

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");
        int num = scanner.nextInt(); // Used to take user input

        if (num > 0){
            System.out.println("Positive number");
        }
        else if (num < 0) {
            System.out.println("Negative number");

        }
        else {
            System.out.println("Invalid number");
        }

    }
}
