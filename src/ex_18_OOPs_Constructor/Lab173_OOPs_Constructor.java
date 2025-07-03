package ex_18_OOPs_Constructor;

public class Lab173_OOPs_Constructor {
    // Default constructor is automatically called when an object is created- see below
    public static void main(String[] args) {

        // Object creation is done here

        Baby b1 = new Baby(); // o/p Default Constructor

    }

}
class Baby {
    // Attribute | Instance Variable |  Member variables, data members
    String name;

    //Default constructor - It has same name as class name
    Baby(){
        System.out.println("Default Constructor");

        // Anything that you want to read/do before creating object, you can write the code here - ex if you want to -
        // Fetch data from the MySQL database...
        // Read from CSV File , XLSX
        // Open a file and read the data. (json, testdata.xlsx, txt file)

    }


    // Behaviour
    void cry(){
        System.out.println("Cry!!");
    }

    void sleep(){
        System.out.println("Sleep!!");
    }

    void eat(){
        System.out.println("Eat!!");
    }
}

