package ex_11_While_Loop;

import java.util.Scanner;

public class Lab121_While_IQ_Factorial {
    public static void main(String[] args) {
        //Factorial Program

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the number!");
        if(!scanner.hasNextInt()){ // if you try to give user i/p as string then below statement will be executed
            System.out.println("Enter the int value");
            return;
        }
        int number = scanner.nextInt();

        long factorial = 1;

        if (number < 0){ // When user i/p value like -1, -2 then below statement is executed
            System.out.println("Negative factorial is not allowed");
            return;
        }

        if (number <= 0){
            System.out.println(factorial);
        }
        else {
            // calculate factorial
            for (int i = 1; i <= number; i++){
                factorial = factorial*i;
            }
        }
        System.out.println("Factorial is: " + factorial); //This prints the calculated factorial
    }
}
