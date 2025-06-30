package ex_14_Strings;

import java.sql.SQLOutput;
import java.time.format.SignStyle;

public class Lab141_String_Interview_P2 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello"; // SCP-> 1 string

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello"); // Object area - 3 strings

        // Question 1 - check the location reference of SCP and OA strings
        // == Comparison -> String -> this check the location reference

        System.out.println(s1 == s2); // False -> s1 is present in SCP & s2 is present in object area
        System.out.println(s1 == s3); // False -> s1 is present in SCP & s3 is present in object area
        System.out.println(s2 == s3); // False -> s2 & s3 are present in same OA, but different in diff memory

        System.out.println(s1 == s4); // True -> They present in SCP and in same memory

        // Question 2: check for content
        // use equals (content) -> value
        System.out.println(s1.equals(s2)); // True both have same content as Hello
        System.out.println(s1.equals(s3)); // True both have same content as Hello

        System.out.println(s3.equals(s5));// false - due to case sensitivity Hello & hello, this can be prevented by using eualsIgnoreCase see below
        System.out.println(s3.equalsIgnoreCase(s5)); // Now s3 = s5 = true

        //  equalsIgnoreCase -> pramod. Pramod, PRAMOD , PraMod . PramoD -> pramod
        //  == - check for the ref
        // = assignment the value

    }
}
