package ex_31_Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab239_Generics_List {
    public static void main(String[] args) {
        List normalList = new ArrayList();
        normalList.add(10);
        normalList.add("Ruchi");
        normalList.add(true);

        List<Integer> integerList = new ArrayList(); // only integer values are allowed
        integerList.add(10);
        // integerList.add("Pramod"); // integers not allowed
    }
}

// List - Collection Framework ->collection of items -> 12,3, pramod, dutta.
