package ex_07_Increment_Decrement_OP;

public class Lab075_Exp1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // a++ -> A -> ExpA = 10 (First print a=10), (Then increment value of a by 1) a = 11
        // +
        // ++a -> B -> ExpB = 12(a=11, first increment by 1 (a=12) and print), value of a = 12
        // In output the total of ExpA + ExpB is displayed = (10 + 12 = 22)
    }
}
