package ex_06_Ternary_Operator;

public class Lab068_TO_Three_MaxNum {
    public static void main(String[] args) {
        //Find the maximum/larger number between three given numbers
        // We will be using the logic building formula.

        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        //Step-1: Find input and output
        // I/O - n1, n2, n3 - int
        // O/P - String -> max number

        // step-2: Rough logic, think about it
        // n1>n2 and n1>n3 -> n1 is the max number
        // n2>n3 and n2>n1 -> n2 is the max number else
        // n3 is the max number

        // Step-3: Write the logic
        // int max = (n1>n2)? A : B;
        int max = (n1>n2) ? (n1>n3) ? n1 : n3 : (n2>n3) ? n2 : n3;
        // A -> (n1>n3) ? n1 : n3
        // B -> (n2>n3) ? n2 : n3
        System.out.println(max);

    }
}
