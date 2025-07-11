package ex_31_Generics;

public class Lab237_Generics_Method_Fix {
    public static void main(String[] args) {
        display(3,4);
        display(3.14,4.45);
        display("sejal","shreya");

    }

    //After <T> you can see T - this means if there is any return type mention T in place of void
    static <T> T display(T a,T b, T c) {
        System.out.println(a);
        System.out.println(b);
        return null;
    }

    // Below it does not return anything, hence mentioned void
    static <T> void display(T a,T b) {
        System.out.println(a);
        System.out.println(b);
    }
}
