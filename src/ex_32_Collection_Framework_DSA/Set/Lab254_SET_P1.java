package ex_32_Collection_Framework_DSA.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab254_SET_P1 {
    public static void main(String[] args) {
        Set hs = new HashSet();

        Set lhs = new LinkedHashSet();

        Set ths = new TreeSet();

        hs.add("Aanya");
        hs.add("Avni");
        hs.add("Avni");
        System.out.println(hs);
    }
}
