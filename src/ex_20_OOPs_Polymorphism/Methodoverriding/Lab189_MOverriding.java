package ex_20_OOPs_Polymorphism.Methodoverriding;

public class Lab189_MOverriding {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.Sound(); // output - Bark!
        // If Bark class is not available then "Default Sound" will be the output
    }

}
class Animal{
    void Sound(){
        System.out.println("Default Sound");
    }
}
class Dog extends Animal{
    @Override
    void Sound() {
        System.out.println("Bark!");
    }
}
