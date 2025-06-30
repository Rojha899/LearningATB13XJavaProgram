package ex_14_Strings;

public class Lab137_String_Immutable {
    public static void main(String[] args) {
        String s1 = "hello";
        s1.concat("world");
        System.out.println(s1); // This prints only -> hello

        // Reassign values
        String s2 = "hello";
        s2 = s2.concat("world");// Concat, basically add the value or merge the value in the end -> o/p -> helloworld
        System.out.println(s2);
    }
}
