package ex_13_Functions;

public class Lab131_User_Defined_One {
    public static void main(String[] args) {

        // Step-2 calling function inside main
        int result = sum_of_twonum(4,5);
        System.out.println(result);

    }

    // step-1 function declaration outside main, but within class
    static int sum_of_twonum(int a, int b){
       return a + b;
    }
}
