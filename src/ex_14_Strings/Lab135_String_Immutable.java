package ex_14_Strings;

public class Lab135_String_Immutable {
    public static void main(String[] args) {
        String name = "Pramod"; // Created in SCP - String Constant Pool
        name.toUpperCase();
        System.out.println(name); // This will print Pramod only since it is not changeable

        // To print in all capital - PRAMOD re-assign the value
        String name1 = "Pramod";
        name1 = name1.toUpperCase();
        System.out.println(name1); // Print name in all capital letters

    }
}
