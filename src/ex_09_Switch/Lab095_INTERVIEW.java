package ex_09_Switch;

public class Lab095_INTERVIEW {
    public static void main(String[] args) {
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1: // -1 expression matches with switch expression -> o/p is 10
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
    }
}
