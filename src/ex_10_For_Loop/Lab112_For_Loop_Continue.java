package ex_10_For_Loop;

public class Lab112_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++){
            if (i == 5){
                continue; // skip the code and move to next to top. here 5 will be skipped from output & continue with next num
            }
            System.out.println(i);
        }
    }
}
