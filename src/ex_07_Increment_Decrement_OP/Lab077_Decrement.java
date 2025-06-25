package ex_07_Increment_Decrement_OP;

public class Lab077_Decrement {
    public static void main(String[] args) {
        int a = 10;
        int result_post = a--; // post-decrement - first assign the value, then decrement by one.
        System.out.println(result_post); // 10
        System.out.println(a); //9
    }
}
