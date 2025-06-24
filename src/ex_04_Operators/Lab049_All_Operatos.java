package ex_04_Operators;

public class Lab049_All_Operatos {
    public static void main(String[] args) {
        boolean b1 = true;
        int a = 10;
        int b = 20;
        System.out.println(a + b); // Answer = 10+20 = 30
        System.out.println(a > b); // 10>20 = false
        System.out.println(a >= b); // 10>=20 = false
        System.out.println(a == b); // 10 == 20 = false
        System.out.println(a != b); // 10 != 20 = true

        // Arithmetic Operators
        // +,-,%,/,*

        // Relational Operators
        // > , < , >= <=, !, != , == (compare two value)

        // Logical Operators
        //  OR or and , || , && , !

        // Optional to learn - Digital Electronics

        // Bitwise Operator - Not important for Automation
        // ~ - Bitwise Not,
        // >> - Right shift,
        // << Left Shift,
        // ^ - XOR

        // Compound Assignment Operators
        //     // +=, -=, /=, *=
        int age = 10;
        // age /= 10; // This is similar to age = age/10 = 10/10 = 1
       // age += 10; // age = age+10 = 10+10 = 20
        age -= 10; // age = age-10 = 10-10 = 0
        System.out.println(age);

        // ++,-- - Increment and Decrement Operator
        // Ternary Operator ?:


    }
}
