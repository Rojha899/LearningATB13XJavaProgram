package ex_13_Functions;

import java.util.Scanner;

public class Lab_Test_P7 {
    public static void main(String[] args) {
        //Create a program to find the largest among three numbers using if-else statements.
        //**Requirements:**
        //- Read three integers from user input
        //- Use nested if-else or if-else if statements
        //- Handle cases where numbers might be equal

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number");
        int num1 = scanner.nextInt();

        System.out.println("Enter Second Number");
        int num2 = scanner.nextInt();

        System.out.println("Enter Third Number");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("Largest Number is: " + num1 );
        }
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest Number is: " + num2);
        }
        else {
            System.out.println("Largets Number is: " +num3);
        }
    }
}
