package ex_10_For_Loop;

public class Lab101_For_Loop_Interview {
    public static void main(String[] args) {
        for (int i = 0; i > 1; i++){
            System.out.println(i); // this will never run as condition fails, 0>1 (False), 1>1 (False)
        }
        System.out.println("End"); // End is the output
    }
}
