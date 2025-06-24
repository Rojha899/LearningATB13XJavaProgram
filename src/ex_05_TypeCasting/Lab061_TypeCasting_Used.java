package ex_05_TypeCasting;

public class Lab061_TypeCasting_Used {
    public static void main(String[] args) {
        int course = 100;
        float GST = 18.45F;
        // int total = course+GST; // Narrow - Implicit
        int total1 = course+(int)GST; // Narrow - Explicit
        System.out.println(total1); // here we are losing data .45 hence o/p displays 118


        float total2 = course+GST; // Widening - auto - implicit
        float total3 = (float)course+GST; // Widening  - Explicit
        System.out.println(total2); // o/p = 118.45
        System.out.println(total3); // o/p = 118.45

    }
}
