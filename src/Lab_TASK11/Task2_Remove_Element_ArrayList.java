package Lab_TASK11;

import java.util.ArrayList;

public class Task2_Remove_Element_ArrayList {
    // Remove an Element from ArrayList
    //Description:
    //Create an ArrayList with these names: Amit, Neha, Suresh.
    //Remove the name Neha and display the updated list.
    // Expected Output:
    // Names after removal:
    // [Amit, Suresh]
    public static void main(String[] args) {
        // Create arraylist
        ArrayList arrayList = new ArrayList();

        // Add names
        arrayList.add("Amit");
        arrayList.add("Neha");
        arrayList.add("Suresh");
        //System.out.println(arrayList); // o/p - [Amit, Neha, Suresh]

        // Remove Neha and display remaining names
        arrayList.remove("Neha");
        System.out.println(arrayList); // [Amit, Suresh]


    }
}
