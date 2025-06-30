package ex_13_Functions;

import java.util.Scanner;

public class Lab_Test_P11 {
    public static void main(String[] args) {
        // Write a program to print numbers from 1 to N using a for loop.
        //**Requirements:**
        //- Read the value of N from user input
        //- Use for loop to print numbers from 1 to N
        //- Print numbers in a single line separated by spaces

        Scanner sc = new Scanner(System.in);

        // Read the value of N from user input
        System.out.println("Enter a N number");
        int n = sc.nextInt();

        System.out.println("Number from 1 to " +n);
        for (int i = 1; i <= n; i++){
            System.out.println(i + " ");
        }

    }
}
