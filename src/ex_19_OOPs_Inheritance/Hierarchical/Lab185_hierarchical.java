package ex_19_OOPs_Inheritance.Hierarchical;

public class Lab185_hierarchical {
    public static void main(String[] args) {
        Father f1 = new Father();
        f1.Home();

        Pramod p1 = new Pramod();
        p1.Home();

        Lucky l1 = new Lucky();
        l1.l2();
        l1.Home();
    }

}
class Father{
    void Home(){
        System.out.println(" 3BHK ");
    }
}
class Pramod extends Father{
    void h2(){
        System.out.println("h2-Pramod");
    }
}
class Lucky extends Father{
    void l2(){
        System.out.println("Lucky");
    }
}
