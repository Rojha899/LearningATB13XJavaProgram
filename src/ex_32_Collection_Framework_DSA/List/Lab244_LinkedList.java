package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab244_LinkedList {
    public static void main(String[] args) {
        List list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add(123);
        list.add(true);

        System.out.println(list);
        System.out.println(list.contains("c"));
        System.out.println(list.size());

    }
}

