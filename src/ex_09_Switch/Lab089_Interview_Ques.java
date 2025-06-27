package ex_09_Switch;

public class Lab089_Interview_Ques {
    public static void main(String[] args) {

        // We have character ch='A' is this allowed
        // Answer - Yes, it is allowed, because character is also an integer.

        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No match");
        }
    }
}
