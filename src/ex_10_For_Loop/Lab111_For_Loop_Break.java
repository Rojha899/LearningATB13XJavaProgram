package ex_10_For_Loop;

public class Lab111_For_Loop_Break {
    public static void main(String[] args) {
        // Note:
        // Loops can have break statement
        // if - can not have break statement
        for (int i = 0; i < 50 ; i++){
            if (i == 5){ // It will print numbers from 0-4 and break (Come out of loop)
                break;
            }
            else{
                System.out.println(i);
            }
        }


    }
}
