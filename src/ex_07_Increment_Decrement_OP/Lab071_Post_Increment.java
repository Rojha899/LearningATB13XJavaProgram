package ex_07_Increment_Decrement_OP;

public class Lab071_Post_Increment {
    public static void main(String[] args) {
        // int a= 10;
        // System.out.println(++a); // o/p = 11
        // System.out.println(a); // o/p = 11

        //Post Increment example - Print  first and then increase the value by one
        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

        // ERT rule
        // Line# | a  | Print
        // 10    | 10 |  NA
        // 11    | 11 | 10 // print first as 10 and them increase value of a by 1
        // 12    | 11 | 11
    }
}
