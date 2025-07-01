package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array(Int only):");
        int size = sc.nextInt();

        int[] marks = new int[size];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks");
            marks[i] = sc.nextInt();
            
        }
        System.out.println("Below is the list of marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }

    }
}
