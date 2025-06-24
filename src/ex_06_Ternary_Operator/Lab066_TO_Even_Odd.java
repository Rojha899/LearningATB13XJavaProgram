package ex_06_Ternary_Operator;

public class Lab066_TO_Even_Odd {
    public static void main(String[] args) {
        int num = 12;
        String result = (num%2 == 0) ? "Even" : "Odd";
        System.out.println(result); // 12 is divisible by 2 hence it is EVEN

        int num1 = 55;
        String result1 = (num1%2 == 0) ? "Even" : "Odd";
        System.out.println(result1); // 55 is not divisible by 2 hence it is ODD
    }
}
