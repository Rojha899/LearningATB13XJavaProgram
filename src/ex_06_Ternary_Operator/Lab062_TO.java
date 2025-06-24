package ex_06_Ternary_Operator;

public class Lab062_TO {
    public static void main(String[] args) {
        // Age to Vote?
        int age = 20;

        // Ternary Operator syntax
        // Variable = Condition? Expression1 : Expression2
        String canIVote = age > 18? "Yes" : "No";
        System.out.println(canIVote);
    }
}
