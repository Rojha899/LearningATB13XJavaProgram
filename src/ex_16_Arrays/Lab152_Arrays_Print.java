package ex_16_Arrays;

import java.util.Arrays;

public class Lab152_Arrays_Print {
    public static void main(String[] args) {
        // print the marks value
        int[] marks = {51, 67,92, 90, 100, 89};

        for (int i = 0; i < marks.length; i++) { // for loop will execute until marks length
            System.out.println(marks[i]);
        }

        System.out.println("Sorted Array:");
        // Sort array in ascending order
        Arrays.sort(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }

    }
}
