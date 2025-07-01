package ex_16_Arrays;

public class Lab153_Arrays_Max_Min {
    public static void main(String[] args) {
        // Find the maximum and minimum value in given array, use method/functions

        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49}; // indexing = 0 to 9
        int max_output = give_me_max(array);
        int min_output = give_me_min(array);

        System.out.println(max_output);
        System.out.println(min_output);
    }

    // Step-1: function declaration/definintion
    static int give_me_max(int[] array){
        int max = array[0];

        // logic for maximum value
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max =  array[i];
            }

        }
        return max;
    }
    static int give_me_min(int[] array) {
        int min = array[0];

        // logic for minimum value
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        return min;
    }
}
