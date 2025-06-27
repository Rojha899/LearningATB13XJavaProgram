package ex_12_DoWhile;

public class Lab126_Diff_While_DoWhile {
    public static void main(String[] args) {
        int a = 0;
        //while (a < 0){
            //System.out.println(a); // In this case condition is fail - no o/p
            //a++;
        //}

        do {
            System.out.println(a); //dowhile -prints a value then condition is checked, and it comes out of loop since condition fails
            a++;
        }
        while (a < 0);
    }
}
