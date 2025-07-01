package ex_16_Arrays;

public class Lab156_Sum_Of_Array_IQ {
    public static void main(String[] args) {
        // Ques - Print sum of an array
        int[] number = {12, 34, 10};
        int sum = 0;

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];

        }
        System.out.println(sum);
    }
}
