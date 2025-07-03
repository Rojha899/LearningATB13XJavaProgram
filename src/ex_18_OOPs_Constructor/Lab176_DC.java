package ex_18_OOPs_Constructor;

public class Lab176_DC {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.name);
        System.out.println(c1.year);
        System.out.println(c1.model);

        Baby1 b1 = new Baby1();
        b1.name = "Sejal"; //If a name is updated from default name then you can print this way = This prints Sejal instead of gugu
        System.out.println(b1.name); // this prints default name = Gugu
    }
}
class Car{
    String name;
    int year;
    String model;

    // Default Constructor
    Car(){
        name = "Unknown car";
        year = 1999;
        model = "xxx";
    }
}
class Baby1{
    String name;

    Baby1(){
        name = "Gugu";
    }
}
