package ex_13_Functions;

public class Lab_Test_P2 {
    public static void main(String[] args) {
        // Create a Java program that demonstrates various arithmetic and assignment operators.
        //**Requirements:**
        //- Use +, -, *, /, % operators
        //- Demonstrate assignment operators (=, +=, -=, *=, /=)
        //- Show the results of each operation

        int a = 10;
        int b = 5;

        //  Arithmetic Operators
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Display arithmetic results
        System.out.println("Arithmetic operators are:");
        System.out.println("a+b= " + sum);
        System.out.println("a-b= " + diff);
        System.out.println("a*b= " + product);
        System.out.println("a/b= " + quotient);
        System.out.println("a%b= " + remainder);

        // Assignment operators
        System.out.println( "Assignment Operators");
        int x =10;
        System.out.println("x = " +x);

        x+=5; // x = x+5 (10+5 -> x = 15)
        System.out.println("x += 5 " +x);

        x-=3; // x = x - 3 (15-3 -> x = 12)
        System.out.println("x -= 3 " +x);

        x *= 2;  // x = x * 2 (12*2 = 24)
        System.out.println("x *= 2  → x = " + x);

        x /= 4;  // x = x/4 ->  (24/4 = 6)
        System.out.println("x /= 4  → x = " + x);

        x %= 3;  // x = x % 3 (6 % 3 = 0 remainder)
        System.out.println("x %= 3  → x = " + x);


    }
}
