package ex_22_OOPs_AccessModifier.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop JrCop = new Cop(5);
        JrCop.canIShoot(); // this is accessible since it is in same package (Police pkg)
        JrCop.thisDefaultF1();

    }
}
