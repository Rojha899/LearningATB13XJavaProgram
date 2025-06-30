package ex_14_Strings;

public class Lab138_String_Functions {
    public static void main(String[] args) {
        char c = 'A';
        System.out.println(c); // This will only print A - AS there are no functions available for char

        // For string you have n number of functions
        // ex - to find length of string - s1.length(), toUpperCase() ans so on see below-
        String s1 = "ABCD";
        System.out.println(s1.length());     // 4
        System.out.println(s1.toUpperCase()); // ABCD
        System.out.println(s1.toLowerCase()); // abcd
        System.out.println(s1.concat("EF")); // ABCDEF
    }
}
