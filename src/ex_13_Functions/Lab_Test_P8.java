package ex_13_Functions;

import java.util.Scanner;

public class Lab_Test_P8 {
    public static void main(String[] args) {
        //Write a program to check if a given year is a leap year.
        // **Requirements:**
        //- A year is leap if it's divisible by 4
        //- Exception: if divisible by 100, it's not leap unless also divisible by 400
        //- Use logical operators in conditions

        Scanner scanner = new Scanner(System.in); // used to take user input
        System.out.println("Enter a year!");
        int year = scanner.nextInt();
        if ((year%4 == 0) && (year%400 == 0 || year%100 != 0)){
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is NOT a leap year");
        }
    }
}
