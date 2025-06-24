package ex_04_Operators;

public class Lab043_Interview_Concat_Plus {
    public static void main(String[] args) {
        String first_name = "Sejal";
        String last_name = "Shreya";

        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + a + b); // o/p - SejalShreya1010
        System.out.println(a + b + first_name + last_name); // 0/p - 20SejalShreya

        System.out.println(first_name + last_name + (a + b)); // o/p - SejalShreya20
        // in above print statement (a+b) is added and 20 is displayed this is due to BODMAS
        //BODMAS - Bracket, Order, Division, Multiplication, Add, Sub

    }
}
