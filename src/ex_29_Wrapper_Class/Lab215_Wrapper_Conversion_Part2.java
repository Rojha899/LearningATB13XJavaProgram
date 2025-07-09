package ex_29_Wrapper_Class;

public class Lab215_Wrapper_Conversion_Part2 {
    public static void main(String[] args) {
        String num  = "10";
        // converting String -> Wrapper
        Integer a  = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);

        // Converting String to Primitive
        int aa = Integer.parseInt(num);

        // String to Wrapper


        // Convert Wrapper to String (toString method)
        System.out.println(a.toString());

        // Convert Primitive to String
        int age = 10;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString()); // "10"
    }
}
