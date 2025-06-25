package ex_07_Increment_Decrement_OP;

public class Lab072_ID {
    public static void main(String[] args) {
        int a = 10;
        int result = ++a;
        System.out.println(a);
        System.out.println(result);

        // ERT rule
        // Line# | a  | Print result
        // 5     | 10 |  NA
        // 6     | 11 | 11
        // 7     | 11 | NA
        // 8     | 11 | 11
    }
}
