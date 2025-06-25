package ex_06_UserInput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab_UserInput_Scanner_02 {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s);

        System.out.println("Enter an integer");
        int int_value = scanner.nextInt();
        System.out.println(int_value);

        System.out.println("Enter double value");
        double double_input = scanner.nextDouble();
        System.out.println(double_input);


    }
}
