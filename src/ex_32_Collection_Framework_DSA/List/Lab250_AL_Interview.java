package ex_32_Collection_Framework_DSA.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab250_AL_Interview {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);

        System.out.println(marks); // [91, 95, 56, 89]
        Collections.sort(marks); // [56, 89, 91, 95] sorted
        System.out.println(marks);

        // Collection - Interface
        // Collections - Class (it contains complete methods which list,set, qu may required)

        Collections.sort(marks,Collections.reverseOrder()); // [95, 91, 89, 56] reverse order
        System.out.println(marks);


    }
}
