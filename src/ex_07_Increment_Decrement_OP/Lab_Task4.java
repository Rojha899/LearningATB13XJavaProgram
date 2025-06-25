package ex_07_Increment_Decrement_OP;

public class Lab_Task4 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(++x); //6
        System.out.println(x++); // 6
        System.out.println(x); // 7

        // line# | x | result
        // 5     | 5 | NA
        // 6     | 6 | 6 --> ++x increment first, then store the value       o/p = 6
        // 7     | 6 | 7 --> x++ print the value first, then increment by one o/p = 6
        // 8     | 7 |                                                        o/p = 7
    }
}
