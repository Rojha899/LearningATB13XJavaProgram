package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;


public class Lab123_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 100
        // any random => 1 to 100
        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1; //bound takes till 99, +1 if included = 100
        //System.out.println(numberToGuess); // until this statement everytime you run it gives random number as o/p

        // now, lets take user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number!");

        int guess;
        int attempts =0;

        while (true){ //This will continue execution until true condition i
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess){
                System.out.println("Too low, try again");
            }
            else if (guess > numberToGuess){
                System.out.println("Too high, try again");
            }
            else {
                System.out.println("Correct! You guessed it in " + attempts + "attempts");
                break;
            }

        }


    }
}
