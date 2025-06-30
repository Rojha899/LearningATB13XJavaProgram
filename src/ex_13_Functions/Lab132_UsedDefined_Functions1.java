package ex_13_Functions;

public class Lab132_UsedDefined_Functions1 {
    // User Defined Functions.

    // 1.Without Parameters and Without Return Type
    // 2.Without Parameters but With Return Type
    // 3.With Parameters and Without Return Type
    // 4. With Parameters and With Return Type

    public static void main(String[] args) {
        //Step-2: Calling a function with in main
        wp_wr_greet();                               // Type-1 UD function - without param, without return type
        String msg = greet_with_hello_wp_with_RT(); // Type-2 UD function - without param, but with return type
        System.out.println(msg);
        greet_with_details("Ruchi", 50, 500); // Type-3 UD function - with param, no return type

        // Type-4 - with param, and with retrun type  -
        int sum = sum_of_two_numbers(3, 4);
        System.out.println(sum);

        int sum2 = sum_of_three_numbers(2,3,4);
        System.out.println(sum2);

    }
    // Step-1 Function declaration/definition

    // 1.Without Parameters and Without Return Type - Function declaration/definition

    static void wp_wr_greet(){ // This does not return anything just print the value
        System.out.println("Hi, how are you!");
        System.out.println();
    }

    // 2.Without Parameters but With Return Type
    static String greet_with_hello_wp_with_RT(){
        System.out.println("Without Parameter - With Return Type ");
        System.out.println();
        return "How are you!";

    }
    // 3.With Parameters and Without Return Type (Used 90%)
    static void greet_with_details(String name, int age, double salary){
        System.out.println("Name is: " + name + "\nAge is: " + age + "\nSalary is: " + salary );
        System.out.println();

    }
    // 4. With Parameters and With Return Type
    static int sum_of_two_numbers(int a, int b){
        return a+b;
    }

    static int sum_of_three_numbers(int a, int b,int c){ // you can pass as many parameter as you can
        return a+b+c;
    }



}
