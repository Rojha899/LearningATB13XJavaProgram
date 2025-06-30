package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {
        ruchi_f1();
        return_int();
        return_boolean();
        return_long();
        return_float_pi_value();
        return_string();
    }

    static void ruchi_f1(){
        System.out.println("No Return");
    }
    static int return_int(){
        System.out.println("Hi, this function returns something!");
        return 10;
    }
    static  boolean return_boolean(){
        System.out.println("Returns boolean type");
        return true;
    }
    static long return_long(){
        return 10L;
    }
    static float return_float_pi_value(){
        return 3.14F;

    }
    static String return_string(){
        return "Ruchi";
    }

}
