package ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab182_Multil_Level {
    public static void main(String[] args) {
        GrandFather gf = new GrandFather();
        gf.gf();
        System.out.println(gf.gold);
        gf.home();


        System.out.println("------------------");

        Father f1 = new Father(); // Father can access gf functions, hence able to create f1.gf() object
        f1.f();
        System.out.println(f1.gold);
        f1.home();
        f1.gf();

        System.out.println("-------------------");

        // Son extends father & GF both functions - Hence son can have all the functions that gf and father has

        Son s1 = new Son();
        s1.s(); // sons function
        s1.f(); // father function
        s1.gf(); // grandfather function

    }



}
