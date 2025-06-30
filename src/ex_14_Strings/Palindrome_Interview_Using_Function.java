package ex_14_Strings;

import java.util.Scanner;

public class Palindrome_Interview_Using_Function {
    public static void main(String[] args) {
        // Find if given string is PALINDROME or not?
        // madam -> If you reverse it will be -> madam
        // s1 = madam
        // s1_reverse = madam
        // s1 == s1_reverse

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.next();

        String newString_reversed = reverseStringSB(input);
        if (newString_reversed.equalsIgnoreCase(input)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }

    }
    static String reverseStringSB (String userInput){
        StringBuilder sb = new StringBuilder(userInput);
        return sb.reverse().toString();

    }

}
