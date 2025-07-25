package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab196_AB_Cars {
    public static void main(String[] args) {
        WagonR car = new WagonR();
        car.drive();
    }
}
abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
    void checkEngine(){
        System.out.println("Normal Function");
    }
}
class WagonR extends Engine{ // this is concrete class this has to be completed
    @Override
    void startEngine() {
        System.out.println("Starting the car!");
    }

    @Override
    void stopEngine() {
        System.out.println("Stoping the car!");
    }
    void drive(){
        checkEngine();
        startEngine();
        stopEngine();
    }

}


