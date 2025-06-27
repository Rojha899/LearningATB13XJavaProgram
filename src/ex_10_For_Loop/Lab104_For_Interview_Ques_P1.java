package ex_10_For_Loop;

public class Lab104_For_Interview_Ques_P1 {
    public static void main(String[] args) {

        //In below statement there is no increment/decrement what is the output?
        // output: No, output -> 0 is not greater than 10 condition fails. It comes out of the loop.

        for (int i = 0; i > 10;){
            System.out.println(i);
        }
    }
}
