package ex_13_Functions;

import java.util.Scanner;

public class Lab_Test_P9 {
    public static void main(String[] args) {
        // Create a program using switch statement to display the day of the week.
        //**Requirements:**
        //- Read a number (1-7) representing day of week
        //- Use switch statement to print corresponding day name
        //- Handle invalid input with default case

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 1-7");
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
                System.out.println("Invalid Day");
                break;

        }
    }
}
