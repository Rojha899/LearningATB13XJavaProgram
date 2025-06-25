package ex_07_Increment_Decrement_OP;

public class Lab076_Exp2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + ++a);
        System.out.println(a);

        // ++a -> A -> ExpA = 11 , value of a -> 11
        // +
        // ++a -> B -> ExpB = 12 , value of a -> 12
        // In output the total of ExpA + ExpB is displayed = (11 + 12 = 23)
    }
}
