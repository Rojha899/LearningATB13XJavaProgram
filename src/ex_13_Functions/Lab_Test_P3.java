package ex_13_Functions;

public class Lab_Test_P3 {
    public static void main(String[] args) {
        //Write a program that demonstrates comparison and logical operators.
        //**Requirements:**
        //- Use comparison operators (==, !=, <, >, <=, >=)
        //- Use logical operators (&&, ||, !)
        //- Print boolean results with explanatory messages

        int a = 10;
        int b = 20;
        boolean x = true;
        boolean y = false;

        // Comparison Operators
        System.out.println("Comparison Operators:");
        System.out.println("a == b: " + (a == b)); // False
        System.out.println("a != b: " + (a != b)); // True
        System.out.println("a > b: " + (a > b)); // false
        System.out.println("a < b: " + (a < b)); // true
        System.out.println("a >= b: " + (a >= b)); // false
        System.out.println("a <= b: " + (a <= b)); // true

        System.out.println();

        // Logical Operators
        System.out.println("Logical Operators:");
        System.out.println("x && y (true AND false): " + (x && y)); // (true && false = false)
        System.out.println("x || y (true OR false): " + (x || y)); // (true || false = true)
        System.out.println("!x (NOT true): " + (!x)); // false
        System.out.println("!y (NOT false): " + (!y)); // true
    }
}


