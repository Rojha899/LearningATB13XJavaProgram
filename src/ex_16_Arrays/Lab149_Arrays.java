package ex_16_Arrays;

public class Lab149_Arrays {
    public static void main(String[] args) {

        // Difference between
        // Arrays: arr.length and
        // String: str.length()

        int a = 10; // string declaration
        int[] marks = {91, 90, 51, 100, 91, 92, 89}; // Array declaration - Pre-defined array all values are defined
        System.out.println(marks.length); // length starts from 1
        System.out.println(marks[0]); // index starts from 0 -> Hence, at 0 position 91 is available = 91 o/p
        System.out.println(marks[6]); // 6th index -> 89
//        System.out.println(marks[10]); java.lang.ArrayIndexOutOfBoundsException - There is nothing at 10th index - error

        boolean[] is_married_people = {true, true, false};

        char c = 'A';
        String name = "Pramod";
    }
}
