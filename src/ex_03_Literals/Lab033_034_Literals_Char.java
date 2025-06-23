package ex_03_Literals;

public class Lab033_034_Literals_Char {
    public static void main(String[] args) {
        char c1 = 'A';
        System.out.println(c1);

        //ESCAPE CHARACTERS

        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("RuchiOjha");
        System.out.println("Ruchi" +new_line+ "Ojha");
        System.out.println("Ruchi" +tab_line+ "Ojha");
        System.out.println("Ruchi" +back_space+ "Ojha");
        System.out.println("Ruchi" +carriage_return+ "Ojha");
    }
}
