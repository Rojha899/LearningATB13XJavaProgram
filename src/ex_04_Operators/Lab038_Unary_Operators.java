package ex_04_Operators;

public class Lab038_Unary_Operators {
    public static void main(String[] args) {
        //Unary Operators
        int a = +10; // JVM says + sign is optional
        int a1 = -110; // - is mandatory
        int result = a+a1;
        System.out.println(a);     // o/p -> 10
        System.out.println(a1);    // o/p -> -110
        System.out.println(result);// o/p -> -100

        int b = -1;
        b = b+1;
        System.out.println(b);
    }
}
