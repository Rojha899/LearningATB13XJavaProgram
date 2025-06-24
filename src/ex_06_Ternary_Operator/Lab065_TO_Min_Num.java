package ex_06_Ternary_Operator;

public class Lab065_TO_Min_Num {
    public static void main(String[] args) {
        // Find the minimum value between 2 numbers using ternary operator

        int a = 10;
        int b = 30;
        int min = a < b? a : b;
        System.out.println(min);

        //System.out.println(Math.min(a,b));
    }
}
