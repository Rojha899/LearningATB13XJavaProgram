package ex_06_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner class
        System.out.println("Enter your age.");

        int age = scanner.nextInt(); // It accepts only integer values.
        String canIVote = age>=18 ? "Yes" : "No";
        System.out.println(canIVote);
    }
}
