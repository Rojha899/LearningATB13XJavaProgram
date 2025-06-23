package ex_02_Java_Basics;

public class Lab024_PrintF {
    public static void main(String[] args) {
        int a = 20;
        System.out.print("print command print the o/p without new line." );
        System.out.println();
        System.out.println("Add the new line at the end.");

        // printf command is used to format the output

        System.out.printf("Your variable value is %d", a);

        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double
        // %b -> boolean

        int b = 30;
        System.out.println("-----");
        System.out.printf("%d + %d", a,b);
    }
}
