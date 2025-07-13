package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab242_ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList(); // By default ArrayList capacity is 10, hence it is not empty
        arrayList.add("Ruchi");
        arrayList.add(null); // null is also allowed
        arrayList.add(123);
        arrayList.add("Ojha");
        arrayList.add("Ojha"); // Duplicates are allowed
        System.out.println(arrayList);
        System.out.println(arrayList.size());

        // This is also possible
        List l = new ArrayList(); // Dynamic Dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);
        System.out.println(l.isEmpty()); // By default ArrayList capacity is 10, hence it is not empty

        List l2 = new ArrayList();
        System.out.println(l2.isEmpty());


    }
}
