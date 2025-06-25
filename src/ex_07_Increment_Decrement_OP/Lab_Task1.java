package ex_07_Increment_Decrement_OP;

public class Lab_Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = a++; // post-increment - print the value first, then increment by one
        System.out.println("a:" +a+  ",b:" +b);

        // a: 6
        // b: 5
        // line# | a | b
        // 5     | 5 | NA
        // 6     | 6 | 5
        // 7     | 6 | 5  -> a=6 & b=5
    }
}
