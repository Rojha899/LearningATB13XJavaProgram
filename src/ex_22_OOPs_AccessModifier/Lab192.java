package ex_22_OOPs_AccessModifier;

public class Lab192 {
    
}
class Father{
    private int gold = 10;
    int car = 1;
    public int bhk3 = 1;
}

class Son extends Father{
    void weCanuse(){
//        System.out.println(gold); // gold is not accessable since it is private can access with in the class
        System.out.println(car);
        System.out.println(bhk3);
    }
}