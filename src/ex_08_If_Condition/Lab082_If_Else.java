package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_Else {
    public static void main(String[] args) {
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.
        System.out.println("Enter the age.");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age <= 18){
            System.out.println("You are NOT eligible to vote!");
        }
        else{
            System.out.println("You are eligible to vote!");
        }
    }
}
