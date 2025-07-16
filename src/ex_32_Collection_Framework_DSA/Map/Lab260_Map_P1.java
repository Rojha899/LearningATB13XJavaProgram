package ex_32_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab260_Map_P1 {
    public static void main(String[] args) {
        // Map m1 = new Map(); // Map is an interface we can not create object of interface Map

        Map m1 = new HashMap();

        // Map is key and value pair
        // name -> pramod

        m1.put("Name ", " Pramod ");
        m1.put("rollno",1);
        m1.put("phone",987654321);
//        m1.put(34,90);
        System.out.println(m1); // This will print o/p but order will not be maintained
        System.out.println("----------------------------");



        Map m2 = new LinkedHashMap();
        m2.put("Name ", " Amit ");
        m2.put("rollno", 2);
        m2.put("phone", 987654322);
        System.out.println(m2); // This will print o/p in order
        System.out.println("----------------------------");



        Map m3 = new TreeMap();
        m3.put("firstname","pramod");
        m3.put("lastname","dutta");
        m3.put("rollno",1);
        m3.put("phone",987654321);
        System.out.println(m3);


    }
}
