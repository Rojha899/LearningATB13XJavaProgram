package ex_09_Switch;

import java.util.Scanner;

public class Lab085_Switch_Without_Break {
    public static void main(String[] args) {
        // Take a user I/p and tell them which day it is.
        // User will select any one number from 1-7.
        // ex: If user selects 1 -> Monday, 3 -> Wednesday
        // If number selected is above 7, ex -8 then it is not allowed - ERROR
        // Do NOT USE BREAK.

        System.out.println("Enter any one number between 1-7");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Not Allowed");
        }

    }



}
