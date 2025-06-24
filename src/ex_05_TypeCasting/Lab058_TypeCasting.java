package ex_05_TypeCasting;

public class Lab058_TypeCasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Widening -> Implicit Casting
        int a1 = (int)b; // Widening -> Explicit Casting

        // JVM says that in case of widening there is no need of explicit casting

    }
}
