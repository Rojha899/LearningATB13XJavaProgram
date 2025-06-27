package ex_10_For_Loop;

public class Lab102_For_Loop_No_Condition {
    public static void main(String[] args) {

        // There is no condition in for loop
        for (int i = 0; ; i++){
            System.out.println(i); // It runs infinite time
        }

        // exit code 130 (Stop by Yourself-Kill) Red Button - interrupted by signal
        // exit code 0 - Successful.

    }
}
