package ex_10_For_Loop;

public class Lab113_ForLoop_Continue_Even_Numbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++){
            if (i%2 == 0){
                // System.out.println("Even:" + i); used to print even numbers
                continue;
            }
            System.out.println("Odd: " +i); // Prints odd number
        }

    }
}
