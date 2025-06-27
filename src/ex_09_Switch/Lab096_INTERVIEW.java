package ex_09_Switch;

public class Lab096_INTERVIEW {
    public static void main(String[] args) {
        // Char 'C' is also an integer and its ASCII value is 67
        // Since there is no expression that matches 67 -> default statement is executed and o/p is -> Hellooooooo

        char code = 'C';

        switch (code){
            default:
                System.out.println("Hellooooooo"); // There is no match found for code -> 'C' -> its integer value is 67. hence default is executed
                break;
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
