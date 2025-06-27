package ex_12_DoWhile;

import java.util.Scanner;

public class CP_Check_Vowels {
    public static void main(String[] args) {
        // To check if a character is vowel or consonant in java
        // ch = aeiou
        // user will enter character
        // You will check by using if-else loop and give that if the character is a vowel or a consonant.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = scanner.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " Is a vowel");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " Is a consonant");

        } else {
            System.out.println("Invalid Character");
        }


    }
}
