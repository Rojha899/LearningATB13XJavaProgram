package ex_30_Exceptions;

public class Lab222_Try_Catch_Multiple {
    public static void main(String[] args) {
        // Multiple catch example

        System.out.println("1");
        try {
            int a = 10 / 0;
        }catch (ArithmeticException e) {
            System.out.println("Are You Fool");
        }
        catch (Exception e){
            System.out.println("Are You Fool Too");
        }
        System.out.println("2");
    }
}
