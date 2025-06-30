package ex_13_Functions;

import java.util.Scanner;

public class Lab_Test_P10 {
    public static void main(String[] args) {
        // Write a program to create a simple calculator using switch statement.
        //**Requirements:**
        //- Read two numbers and an operator (+, -, *, /)
        //- Use switch statement to perform the operation
        //- Handle division by zero
        //- Display the result

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = scanner.nextInt();

        System.out.println("Enter Second Number");
        int num2 = scanner.nextInt();

        System.out.println("Enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        int result;

        switch (operator){
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;

            default:
                System.out.println("Invalid");
        }


    }
}
