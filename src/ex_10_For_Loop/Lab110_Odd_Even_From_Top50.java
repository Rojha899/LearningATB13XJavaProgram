package ex_10_For_Loop;

public class Lab110_Odd_Even_From_Top50 {
    public static void main(String[] args) {
        // Find the even numbers from 1-50 (Number divisible by 2) use (i%2 == 0)
        for (int i =1; i <= 50; i++){
            if (i%2 == 0){
                System.out.println("Even:" + i);
            }
        }

    }
}
