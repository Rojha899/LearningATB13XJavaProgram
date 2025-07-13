package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.List;

public class Lab243_AL {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1"); // Index 0
        list.add("2"); // Index 1
        list.add("3"); // Index 2
        list.add("3"); // Index 3
        list.add(4);   // Index 4
        list.add(true);// Index 5
        list.add("3"); // Index 6

        System.out.println(list.size());
        System.out.println(list.contains("2"));
        System.out.println(list.isEmpty());
        System.out.println(list.contains(1));

        // Returns the index of the first occurrence of the specified element in this list,
        System.out.println(list.indexOf("3"));
        System.out.println(list.lastIndexOf("3"));

        System.out.println(list);
        System.out.println(" --------------- ");

        for (int i = 0; i < list.size(); i++) { // printing list using for loop
            System.out.println(list.get(i));
        }
        System.out.println(" --------------- ");

        for (Object o: list){
            System.out.println(o);
        }
        // Change values of list
        list.set(1, 25); // index 1 values will be changed to 25
        System.out.println(list);

        list.remove(0);  // Remove element at index 0
        System.out.println(list);


        list.clear();
        System.out.println(list);

    }
}
