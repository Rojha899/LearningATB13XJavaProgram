package ex_08_If_Condition;

public class Lab081_If_P1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]); // CLI user input - use edit config -> enter arg value
        if (age > 18){
            System.out.println("Yes, you can go to GOA!");
        }
        else {
            System.out.println("No, You can't Go to GOA!!");
        }

    }
}
