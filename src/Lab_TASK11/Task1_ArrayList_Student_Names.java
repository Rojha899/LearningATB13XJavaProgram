package Lab_TASK11;

import java.util.ArrayList;

public class Task1_ArrayList_Student_Names {
    // Add and Display Elements in ArrayList
    // Description:
    //Create an ArrayList of student names. Add the following 5 students:
    //Dipak, Ravi, Sneha, Priya, Anjali.
    //Then display all names using a loop.

    //Expected Output:  //Student List:
    //Dipak
    //Ravi
    //Sneha
    //Priya
    //Anjali
    public static void main(String[] args) {
        ArrayList students = new ArrayList();

        // Add student names
        students.add("Dipak");
        students.add("Ravi");
        students.add("Sneha");
        students.add("Priya");
        students.add("Anjali");

        // Display above student list using loop
        System.out.println("student List: \n");

        for (int i=0; i<students.size(); i++){
            System.out.println(students.get(i));
        }
    }
}
