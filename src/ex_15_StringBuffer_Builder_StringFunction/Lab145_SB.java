package ex_15_StringBuffer_Builder_StringFunction;

public class Lab145_SB {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Ruchi");
        stringBuffer.append("Ojha"); // Append will add text (Ojha) to the end of existing text (Ruchi)
        System.out.println(stringBuffer); // o/p - Ruchi Ojha

        System.out.println(stringBuffer.reverse()); // ahjOihcuR (Reverse of RuchiOjha)

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1); // Hello
    }
}
