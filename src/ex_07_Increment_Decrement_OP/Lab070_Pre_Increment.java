package ex_07_Increment_Decrement_OP;

public class Lab070_Pre_Increment {
    public static void main(String[] args) {
        int a =10;
        int b = ++a; //Pre-increment
        System.out.println(a);
        System.out.println(b);

        //  Expression and Result Table
        // Line No | a  | Result b
        //  8      | 10 |  NA
        //  9      | 11 |  11

        //  10     | 11(NA) | 11
        //  11     | 11     | 11(NA)
    }
}
