package ex_15_StringBuffer_Builder_StringFunction;

public class Lab147_Sbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Appends text
        sb.reverse(); // reverse the text
        System.out.println(sb); // Print the reverse of Hello World = dlroW olleH
    }
}
