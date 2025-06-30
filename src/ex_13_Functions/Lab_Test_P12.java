package ex_13_Functions;

import java.util.Scanner;

public class Lab_Test_P12 {
    public static void main(String[] args) {
        // Create a program to calculate factorial of a number using while loop.
        // **Requirements:**
        //- Read a positive integer from user input
        //- Use while loop to calculate factorial
        //- Handle edge case for 0! = 1
        //- Use appropriate data type to handle large results

        // Read a positive number from user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number!");
        int num = scanner.nextInt();

        int i = 1;
        long fact = 1; // Long is used to handle larger results

        //- Handle edge case for 0! = 1
        if (num == 0){
            fact = 1;
        }
        else {
            while (i <= num){
                fact = fact * i;
                i++;
            }
        }
        System.out.println("Factorial of " +num+ " is: " +fact);
    }
}
