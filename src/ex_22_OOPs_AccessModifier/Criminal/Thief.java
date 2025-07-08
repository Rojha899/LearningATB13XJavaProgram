package ex_22_OOPs_AccessModifier.Criminal;

import ex_22_OOPs_AccessModifier.Police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100);
        thief.gun = 100;
        //thief.canIShoot(); // this is private/protected in cop class, cannot access it

    }
}

