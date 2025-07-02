package ex_17_OOPs;

public class Lab168_Cats {
    public static void main(String[] args) {
        Cat c1 = new Cat(); // object 1 will be created
        new Cat(); // 2nd object will be created
        Cat C2; // since it is object reference no object will be created

        c1.running();
        new Cat().running();
    }
}
class Cat{
    String name; //null no usage

    void running(){
        System.out.println("Running");
    }
}
