package ex_04_Operators;

public class Lab056_Interview_Ques {
    public static void main(String[] args) {
        short s = 10;
        char c = 'A';
        String s1 = "A";

        //When it's with its integral, it acts as an integer. c+s = 65+10, hence, o/p = 75
        System.out.println(c+s);

        System.out.println(c); // When it is alone it act as character - hence o/p = A
        System.out.println(c+c); // o/p -> 65+65 = 130
        System.out.println(c+s1); // o/p -> AA (Concatination)
    }
}
