package ex_16_Arrays;

import java.util.Arrays;

public class Task_Second_LargestNum {
    public static void main(String[] args) {
        // Find 2nd Largest Number in an Array
        // You find it without using the sort function.

        int[] num = {12, 34, 10, 1, 100, 3, 4, 32};
        for (int i = 0; i < num.length-1; i++) {
            for (int j = 0; j<num.length-1; j++){
                if (num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        for (int k = 0; k < num.length; k++){

        }
        System.out.println("Second Largest Number is: " + num[num.length-2]);

    }
}
