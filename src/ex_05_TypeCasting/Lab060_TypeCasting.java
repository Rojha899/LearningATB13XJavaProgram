package ex_05_TypeCasting;

public class Lab060_TypeCasting {
    public static void main(String[] args) {
        long phone = 9876543210L;

        // short s = phone; // Implicit Narrow? - This is not allowed

        short s1 = (short)phone; // Explicit Narrow? - we have to mention to convert it into short
    }
}
