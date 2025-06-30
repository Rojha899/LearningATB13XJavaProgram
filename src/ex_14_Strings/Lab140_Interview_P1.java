package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
        //Ques-1: How many strings are present in string constant pool - SCP
        String s1 = "Hello";
        String s4 = "Hello";

        //Answer for above code - only one string in SCP - Due to string immutable

        // Ques-2: How many strings are present in object area?
        // Answer - Three strings in object area as shown below

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("Hello");

        //SCP / OA
        // 1  / 3 = TOTAL 4 STRINGS

    }
}
