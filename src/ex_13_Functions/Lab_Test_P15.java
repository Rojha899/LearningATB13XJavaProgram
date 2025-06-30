package ex_13_Functions;

public class Lab_Test_P15 {
    public static void main(String[] args) {
        //Write a program to find and print all prime numbers between 1 and 100 using loops.
        // **Requirements:**
        //- Use nested loops to check for prime numbers
        //- A prime number is divisible only by 1 and itself
        //- Print all prime numbers in the range 1-100
        //- Optimize the algorithm for better performance

        System.out.println("Prime numbers between 1 and 100:");

        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check divisibility from 2 to square root of num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Not prime
                    break;           // Exit loop early
                }
            }

            // Print the prime number
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
