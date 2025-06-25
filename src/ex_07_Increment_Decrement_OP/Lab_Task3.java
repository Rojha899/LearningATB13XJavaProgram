package ex_07_Increment_Decrement_OP;

public class Lab_Task3 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x++ + ++x);

        // line# | x | result
        // 5     | 5 | NA
        // 6     | 5 | 6 --> x++ first print x=5, then increment by one = 6 after increment x=6
        // 6     | 7 | 5 --> ++x first increment 6 by one = 7, then store the value
        // 6 -> output = 5+7=12

    }
}
