package ex_09_Switch;

import java.util.Scanner;

public class Lab_Task_Triangle_Program {
    public static void main(String[] args) {
        // Given three input values s1, s2, s3 representing the lengths of the sides
        // Determine if -
        // All sides are equal --> It is equilateral triangle
        // Two sides are equal --> It is isosceles triangle
        // No, sides are equal --> It is scalene triangle
        // Use an if-else statement to classify the triangle.

        Scanner scanner = new Scanner(System.in); // Used while taking user input
        System.out.println("Enter side1 value");
        int s1 = scanner.nextInt(); // scanner.next() is used to take integer as user I/P

        System.out.println("Enter side2 value");
        int s2 = scanner.nextInt();

        System.out.println("Enter side3 value");
        int s3 = scanner.nextInt();

        if (s1 == s2 && s2 ==s3){
            System.out.println("It is equilateral triangle - All sides are equal");
        } else if (s1 == s2 || s2 == s3 || s3 == s1) {
            System.out.println("It is isosceles triangle - Two sides are equal ");
        }
        else {
            System.out.println("It is scalene triangle - No sides are equal");
        }


    }
}
