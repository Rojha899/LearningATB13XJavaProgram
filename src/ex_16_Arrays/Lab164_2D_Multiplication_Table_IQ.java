package ex_16_Arrays;

import java.util.Scanner;

public class Lab164_2D_Multiplication_Table_IQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size:");
        int size_of_table = scanner.nextInt();

        for (int i = 0; i < size_of_table; i++) {
            for (int j = 0; j < size_of_table; j++){
                System.out.print(i*j+ " | ");
            }
            System.out.println();

        }

    }
}
