package ex_13_Functions;

import java.util.Scanner;

public class Lab134_Function_Arth {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div
        // with parameter, a, b (take the parameter from the User)

        // Logic Building
        // Step 1 -> Inputs and Outputs
        //  a, b - int -> Scanner
        //  int -> variable result ->

        // Step 2 - Rough logic -> Create functions
        // function -> type 4th - with return and with arguments/ parameters

        // Step 3 - Write the code and Find and Fix  -> Edge Cases

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1");
        int a = 0;                 //Edge case handling - In case if user gives value other than int, then else will be executed
        if (scanner.hasNextInt()){
            a = scanner.nextInt();
        }
        else {
            System.out.println("Enter the int only");
            return; // you can also type System.exit(0); instead of return
        }


        System.out.println("Enter num2");
        int b = 0;
        if(scanner.hasNextInt()){
            b = scanner.nextInt();
        }
        else {
            System.out.println("Enter the int only");
        }

        int sum_result = sum(a,b);
        int sub_result = sub(a, b);
        int div_result = div(a, b);
        int mul_result = mul(a, b);
        int mod_result = mod(a, b);


        System.out.println(sum_result);
        System.out.println(sub_result);
        System.out.println(div_result);
        System.out.println(mul_result);
        System.out.println(mod_result);

    }
    static int sum(int a, int b){
        return a + b;
    }
    static int sub(int a, int b){
        return a - b;
    }
    static int div(int a, int b){
        if (b == 0){                               // Edge case - if user enters b=0
            System.out.println("b can not be zero");
            System.exit(0);
        }
        return a / b;
    }
    static int mul(int a, int b){
        return a * b;
    }
    // Modulus - returns remainder
    static int mod(int a, int b){
        return a % b;
    }

}
