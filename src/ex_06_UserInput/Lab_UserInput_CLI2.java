package ex_06_UserInput;

public class Lab_UserInput_CLI2 {
    public static void main(String[] args) {

        // As we have not passed the arguments and try to run the program it throws exception error
        System.out.println(args[0]); // java.lang.ArrayIndexOutOfBoundsException
        System.out.println(args[1]);
        System.out.println(args[2]);

        // Once arguments are passed in edit config window. It prints the o/p

    }
}
