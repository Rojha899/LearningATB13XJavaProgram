package ex_06_Ternary_Operator;

public class Lab063_TO_P1 {
    public static void main(String[] args) {
        // Verify if number is positive or negative
        int num = 5;
        String result = num > 0 ? "Positive" : "Negative";
        System.out.println(result); // positive 5 is greater than 0

        int num1 = 0;
        String result1 = num1 > 0 ? "Positive" : "Negative";
        System.out.println(result1); // Negative

        int num2 = -10;
        String result2 = num2 > 0 ? "Positive" : "Negative";
        System.out.println(result2); // Negative -10 is less than 0


    }
}
