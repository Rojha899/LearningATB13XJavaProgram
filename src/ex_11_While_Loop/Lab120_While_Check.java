package ex_11_While_Loop;

public class Lab120_While_Check {
    public static void main(String[] args) {
        int i = 0;
        while (i < 0){ // 0<0 condition is false - no output
            System.out.println(i);
            i++;
        }
    }
}
