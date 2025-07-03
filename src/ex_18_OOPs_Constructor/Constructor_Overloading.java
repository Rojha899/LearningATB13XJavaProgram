package ex_18_OOPs_Constructor;

public class Constructor_Overloading {
    public static void main(String[] args) {
        Man m1 = new Man("James");
        Man m2 = new Man("Charles", 45);
        Man m3 = new Man("Raghav", 38, "abc");
        System.out.println(m1.name);
        System.out.println(m2.name);
        System.out.println(m2.age);
        System.out.println(m3.name);
        System.out.println(m3.age);
        System.out.println(m3.address);
    }
}

class Man{
    String name;
    int age;
    String address;

    // Constructor overloading - Class allows - Multiple constructors with different parameters

    Man(String name_user){ // only one parameter
        this.name = name_user;

    }
    Man(String name_user, int age_user){ // two parameters
        this.name = name_user;
        this.age = age_user;

    }
    Man(String name_user, int age_user, String address_user){ // three parameters
        this.name = name_user;
        this.age = age_user;
        this.address = address_user;
    }
}
