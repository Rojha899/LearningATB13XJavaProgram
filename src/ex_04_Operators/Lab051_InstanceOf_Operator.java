package ex_04_Operators;

public class Lab051_InstanceOf_Operator {
    public static void main(String[] args) {
        String s1 =  new String("Ruchi");
        System.out.println(s1 instanceof String); //This will return true
        System.out.println(s1 instanceof Object); // True
       // System.out.println(s1 instanceof Integer); // not possible false
    }
}
