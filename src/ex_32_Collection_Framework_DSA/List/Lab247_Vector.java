package ex_32_Collection_Framework_DSA.List;

import javax.swing.*;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab247_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector(10);

        v.add("Ruchi");
        v.add("Aanya");
        v.add("Sejal");
        System.out.println(v);

        v.remove("Ruchi");
        System.out.println(v);

        System.out.println(v.contains("Sejal"));
        System.out.println(v.contains("Ojha"));

        System.out.println("--------------- Print list using for loop");

        for (int i=0; i<v.size(); i++){
            System.out.println(v.get(i));

        }
        System.out.println(" ----  Print list using For  Each Loop ");

        for (Object o : v) {
            System.out.println(o);
        }

        System.out.println(" ----  Iterator ");

        Iterator iterator = v.iterator();  // Most used - it is available in list, set and queue
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println(" ----  Enumeration "); // Not used

        Enumeration<Object> enumeration = v.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }

    }
}
