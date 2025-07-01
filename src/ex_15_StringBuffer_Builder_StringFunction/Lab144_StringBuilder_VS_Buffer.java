package ex_15_StringBuffer_Builder_StringFunction;

public class Lab144_StringBuilder_VS_Buffer {
    public static void main(String[] args) {

        // Strings can be created using assignment (=) operator
        // Can be created using (new) operator
        // String can also be created using StringBuilder & StringBuffer -> These are mutuable in nature - See below

        String s0 = "Ruchi";
        String s1 = new String("Sejal");

        StringBuffer stringBuffer = new StringBuffer("Aanya");
        StringBuilder stringBuilder = new StringBuilder("Avni");

        System.out.println(s0);             // Ruchi
        System.out.println(s1);            // Sejal
        System.out.println(stringBuffer); // Aanya
        System.out.println(stringBuilder); // Avni
    }
}
