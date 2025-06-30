package ex_13_Functions;

public class Lab133_Interview_Ques {
    public static void main(String[] args) {

    }

    // Defined multiple main methods with in class, with different parameters - Method overloading
    // however, JVM specifically looks for public static void main(String[] args) main method and executes it.

    public static void main(String args) {
        System.out.println("Yes");
    }
    public static int main(int args) {
        return 10;
    }

    public static int main(float args) {
        return 10;
    }

    public static boolean main(boolean args) {
        return true;
    }
}
