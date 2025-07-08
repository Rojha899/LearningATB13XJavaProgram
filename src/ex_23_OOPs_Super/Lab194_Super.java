package ex_23_OOPs_Super;

public class Lab194_Super {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.sound();
    }

}
class God{
    void sound(){
        System.out.println("GOD!!");
    }
}
class Animal extends God{
    @Override
    void sound() {
        super.sound();
    }
    Animal(int a, int b){
        System.out.println(a+b);
    }
    void test(){
        System.out.println(super.gold);
    }
}
