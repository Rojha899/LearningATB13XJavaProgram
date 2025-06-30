package ex_13_Functions;

import java.util.Scanner;

public class Lab_Task2_Grade_Calculator {
    public static void main(String[] args) {
        // Write a program that calculates and displays the letter grade for a given numerical score
        // (e.g., A, B, C, D, or F) based on the following grading scale:
        //A: 90-100
        //B: 80-89
        //C: 70-79
        //D: 60-69
        //F: 0-59

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grade!");
        int marks = scanner.nextInt();
        if (marks>=90 && marks<=100){
            System.out.println("Marks:" +marks+ " Grade: A");
        }
        else if (marks >= 80 && marks <=89) {
            System.out.println("Marks:" +marks+ " Grade: B");

        } else if (marks >= 70 && marks <=79) {
            System.out.println("Marks:" +marks+ " Grade: C");

        } else if (marks >= 60 && marks <= 69) {
            System.out.println("Marks:" +marks+ " Grade: D");

        } else if (marks >=0 && marks <= 59) {
            System.out.println("Marks:" +marks+ " Grade: F");
            
        }
        else {
            System.out.println("Invalid grade!");
        }


    }
}
