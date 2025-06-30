package ex_13_Functions;

import java.util.Scanner;

public class Lap_Task1_LeapYear {
    public static void main(String[] args) {
        //Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

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
