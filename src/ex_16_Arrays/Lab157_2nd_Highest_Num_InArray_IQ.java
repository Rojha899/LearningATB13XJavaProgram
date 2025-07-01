package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_2nd_Highest_Num_InArray_IQ {
    public static void main(String[] args) {
        // Find 2nd Largest Number in an Array

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32}; // first largest - 100 , second largest - 34

        // Below sort function is used to find 2nd larget number
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]); // Gives 2nd larget num
        System.out.println(numbers[numbers.length-3]); // gives 3rd largest num

    }
}
