package ex_18_OOPs_Constructor;

public class Lab177_Pram_Constructor {
    public static void main(String[] args) {

        // Calling DC - no parameters
        BabyA b1 = new BabyA();
        System.out.println(b1.name);
        System.out.println(b1.aadhar_num);

        // Call parameterized constructor - with parameter
        BabyA b3 = new BabyA("Ruchi", "23456717", 2019, 06, 07);
        System.out.println(b3.name);
        BabyA b4 = new BabyA("Aanya", "55456717", 2015, 02, 02);
        System.out.println(b4.name);
    }

}
class BabyA{
    String name;
    String aadhar_num;
    int year;
    int month;
    int day;

    BabyA(){
        name = "Gugu";
        aadhar_num = "0000";
        year = 1981;
        month = 01;
        day = 01;

    }
    // Parameterized constructor
    BabyA(String name_user,String aadhar_num_user,int year_user, int month_user,int day_user){
        this.name = name_user;
        this.aadhar_num = aadhar_num_user;
        this.year = year_user;
        this.month = month_user;
        this.day = day_user;
    }
}
