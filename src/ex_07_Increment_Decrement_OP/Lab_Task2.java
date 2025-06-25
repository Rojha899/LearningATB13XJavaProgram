package ex_07_Increment_Decrement_OP;

public class Lab_Task2 {
    public static void main(String[] args) {
        int i = 1;
        i = i++ + ++i;
        System.out.println(i);

        // line# | i | result
        // 5     | 1 | NA
        // 6     | 1 | 2  -> i++ print the value of i first, then increment by one
        // 6     | 3 | 1  -> ++1 increment value of i first, then store the value
        // 7     | 4 | NA -> o/p = 4

    }
}
