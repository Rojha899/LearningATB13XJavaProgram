package ex_16_Arrays;

public class Lab158_String_CLI_ForEach_Loop {
    public static void main(String[] ruchi) {
        for (int i = 0; i < ruchi.length; i++) {
            System.out.println(ruchi[i]); // args[i] values are available in edit config
        }
        System.out.println("-----------");
        for (String arg : ruchi){
            System.out.println(arg);
        }
    }
}
