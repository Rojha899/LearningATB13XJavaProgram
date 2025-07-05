package ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab183_Multilevel_Dynamic_Dispatch {
    public static void main(String[] args) {
        Son amit = new Son();

        GrandFather g1 = new Son(); // Dynamic Dispatch
        g1.gf();
        g1.home(); //here son object is created, so son home will be called - and  o/p diplays son home
    }
}
