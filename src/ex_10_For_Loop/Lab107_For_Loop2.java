package ex_10_For_Loop;

public class Lab107_For_Loop2 {
    public static void main(String[] args) {
        // Can we use long and float in for loop?
        // Answer - yes we can, but it is not advisable to use - Hence do not use long and float in for loop
        // We will be using integers only

        for (long i = 1l; i < 10; i++) {
            System.out.println(i);
        }
        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
        }
    }
}
