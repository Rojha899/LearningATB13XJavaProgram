package ex_09_Switch;

import java.util.Scanner;

public class Lab084_Switch {
    public static void main(String[] args) {

        // Take a user I/p and tell them which day it is.
        // User will select any one number from 1-7.
        // ex: If user selects 1 -> Monday, 3 -> Wednesday
        // If number selected is above 7, ex -8 then it is not allowed - ERROR

        System.out.println("Enter a number between 1 to 7");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not allowed");
                break;


        }



    }
}
