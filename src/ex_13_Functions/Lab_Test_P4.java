package ex_13_Functions;

public class Lab_Test_P4 {
    public static void main(String[] args) {
        // Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
        // **Requirements:**
        // Show the difference between ++i and i++
        // Show the difference between --i and i--
        // Print values before and after operations

        int a = 5;
        int b = 5;
        // Post-increment: Print the value first, then increment
        System.out.println("Post-increment demonstration");
        System.out.println(a++);
        System.out.println(a);

        System.out.println();

        // Pre-Increment: Increment the value first, then store the value
        System.out.println("Pre-Increment demonstration");
        System.out.println(++b);
        System.out.println(b);

        System.out.println();

        // Post-decrement: Print the value first, then decrement
        int x = 4;
        int y = 5;
        System.out.println("Post-Decrement demonstration");
        System.out.println(x--);
        System.out.println(x);

        System.out.println();

        // Pre-decrement: Decrement value first, then print it
        System.out.println("Pre-Decrement demonstration");
        System.out.println(--y);
        System.out.println(y);

        System.out.println();

    }
}
