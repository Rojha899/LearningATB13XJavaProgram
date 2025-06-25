package ex_07_Increment_Decrement_OP;

public class Lab078_Decrement_Pre {
    public static void main(String[] args) {
        int a= 10;
        int result = --a; // 9 Pre-decrement - decrease the value by one first, then store the result.
        System.out.println(result);
        System.out.println(a); // 9

        // ERT rule
        // Line# | a  | result
        // 5     | 10 | NA
        // 6     | 9  | 9
        // 7     | NA | 9    // Result = 9
        // 8     | 9  | NA   //      a = 9
    }
}
