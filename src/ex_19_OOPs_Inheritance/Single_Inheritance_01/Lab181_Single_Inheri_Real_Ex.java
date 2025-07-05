package ex_19_OOPs_Inheritance.Single_Inheritance_01;

public class Lab181_Single_Inheri_Real_Ex {
    public static void main(String[] args) {
        TestCase1 t1 = new TestCase1();
        t1.runningTC1();

        TestCase2 t2 = new TestCase2();
        t2.runningTC2();

        // Dynamic dispatch - Father reference can be created when child object is present - ex
        // CommomToAll is a father class
        // TestCase1 is a child clas
        // both have extends relationship

        CommonToAll c1 = new TestCase1(); // Dynamic Dispatch



    }
}

