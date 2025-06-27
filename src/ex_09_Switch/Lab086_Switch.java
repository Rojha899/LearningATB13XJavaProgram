package ex_09_Switch;

import java.util.Scanner;

public class Lab086_Switch {
    public static void main(String[] args) {

        // You can have less number of cases without default

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1-7");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }
    }
}
