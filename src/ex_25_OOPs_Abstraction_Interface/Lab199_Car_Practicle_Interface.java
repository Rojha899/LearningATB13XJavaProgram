package ex_25_OOPs_Abstraction_Interface;

public class Lab199_Car_Practicle_Interface {
    public static void main(String[] args) {
        Car1 tesla = new Car1();
        tesla.drive();

    }
}

// Step-2 implement functions & call the functions
class Car1 implements Engine1, Break{

    //Calling functions
    void drive(){
        applyBreak();
        startEngine();
        stopEngine();
    }

    @Override
    public void applyBreak() {

    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }
    @Override
    public void money() {
        System.out.println("Son has o earn by itSelf!");
    }
}




// Step-1 Create interface
interface Break{
    void applyBreak();
    void money();
}
interface Engine1{
    void startEngine();
    void stopEngine();
    default void completeF1(){
        System.out.println("Default Complete Function");
    }

}
