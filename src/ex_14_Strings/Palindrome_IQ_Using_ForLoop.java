package ex_14_Strings;

import java.util.Scanner;

public class Palindrome_IQ_Using_ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.next();

        String newString_reversed = reverseString(input);

        if (newString_reversed.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
    static String reverseString(String userInput){
        String reversed = "";
        for (int i = userInput.length()-1; i >= 0; i--){
            reversed = reversed+ userInput.charAt(i);

        }
        return reversed;
    }

}
