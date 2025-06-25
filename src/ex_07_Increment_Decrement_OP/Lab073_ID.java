package ex_07_Increment_Decrement_OP;

public class Lab073_ID {
    public static void main(String[] args) {
        int a = 10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        // ERT rule
        // Line# | a  | Print result
        // 5     | 10 |  NA
        // 6     | 11 | 10           // first print 10, then increase value of a by 1 =1
        // 7     | 11 | NA           // a= 11
        // 8     | NA | 10          // result = 10
    }
}
