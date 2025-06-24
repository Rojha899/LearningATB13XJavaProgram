package ex_04_Operators;

public class Lab041_Logical_Operators {
    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a);

        boolean b = true;
        System.out.println(!!b);

        boolean c = true || false; // OR gate true, false = true (Remember the OR gate diagram)
        System.out.println(c);

        boolean c1 = true && false; // AND gate true, false = false (Remember the OR gate diagram)
        System.out.println(c1);

    }
}
