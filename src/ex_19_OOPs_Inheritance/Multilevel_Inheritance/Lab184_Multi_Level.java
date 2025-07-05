package ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab184_Multi_Level {
    public static void main(String[] args) {

        // Son s1 = new Father(); // not possible
        //  Son s1 = new GrandFather(); // not possible
        Son amit = new Son();
        System.out.println(amit.gold);
        amit.gf();

        GrandFather grandFather = new Son();
        grandFather.home();
    }
}
