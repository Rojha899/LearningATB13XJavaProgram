package ex_30_Exceptions;

public class Lab224_Try_IQ {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1.trim();
            int a = 10/0;
        }
        catch (NullPointerException | ArithmeticException e) {
            System.out.println("Null or Arithmetic Error");
        }
        System.out.println("End");
    }
}
