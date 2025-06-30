package ex_13_Functions;

public class Lab_Test_P5 {
    public static void main(String[] args) {
        // Write a program that demonstrates operator precedence and type casting in Java.
        //**Requirements:**
        // Show operator precedence with complex expressions
        // Demonstrate implicit and explicit type casting
        // Print results with explanations

        // Operator Precedence Example
        int a = 10, b = 5, c = 2;
        int result1 = a + b * c;          // Multiplication has higher precedence than addition
        int result2 = (a + b) * c;        // Parentheses change the precedence

        System.out.println("Operator Precedence:");
        System.out.println("a + b * c = " + result1);     // 10 + (5 * 2) = 20
        System.out.println("(a + b) * c = " + result2);   // (10 + 5) * 2 = 30

        System.out.println();

        // Type Casting Example
        int x = 7;
        int y = 2;
        double result3 = x / y;              // Integer division, result is 3.0 after implicit cast
        double result4 = (double) x / y;     // Type casting x to double forces floating-point division
        int result5 = (int) 3.75;            // Casting double to int truncates the decimal part

        System.out.println("Type Casting:");
        System.out.println("x / y (int division) = " + result3);     // 3.0
        System.out.println("(double)x / y = " + result4);            // 3.5
        System.out.println("(int) 3.75 = " + result5);               // 3

    }
}
