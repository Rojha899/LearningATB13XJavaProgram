package ex_19_OOPs_Inheritance;

import java.sql.SQLOutput;

public class Lab180_Inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold);
        f1.bhk2();

        System.out.println("----------------------");

        Son s1 = new Son();
        System.out.println(s1.gold); // Son has inherited from father
        s1.bhk2(); // // Son has inherited from father
        s1.bhk3();

    }

}
// Superclass - Father
class Father{
    int gold = 1000;

    void bhk2(){ // Attribute | Data variables |  Property | Instance Variables

        System.out.println("Father has - 2BHK house"); // Behaviour |  Method | Function | Data members
    }
}

//Subclass Son
class Son extends Father{
    void bhk3(){
        System.out.println("Son has - 3bhk house");
    }
}