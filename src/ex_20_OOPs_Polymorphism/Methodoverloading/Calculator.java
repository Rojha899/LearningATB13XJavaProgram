package ex_20_OOPs_Polymorphism.Methodoverloading;

public class Calculator {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        c1.add(4,4);
        c1.add(2.12,3.11);

    }
}
class Calc{
    int add (int a, int b){
        return a + b;
    }
    double add(double  a, double b){
        return a + b;
    }
}