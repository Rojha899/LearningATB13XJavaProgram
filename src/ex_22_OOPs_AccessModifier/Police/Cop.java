package ex_22_OOPs_AccessModifier.Police;

public class Cop {
    public int gun;
    private String icard;

    public Cop(int bullet) {
        this.gun = bullet;
    }
    // Method or Behaviour
    protected  void canIShoot(){
        System.out.println("Yes You can! ");
    }
    void thisDefaultF1(){
        System.out.println("Hi, Cop!");
    }
}


