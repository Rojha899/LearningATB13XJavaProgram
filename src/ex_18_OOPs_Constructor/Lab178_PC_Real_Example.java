package ex_18_OOPs_Constructor;

public class Lab178_PC_Real_Example {
    public static void main(String[] args) {
        //calling PC by creating object
        Person p1 = new Person("Amit", 27654321, "abc");
        System.out.println(p1.name);
        Person p2 = new Person("James",98989898,"XYZ");
    }

}

class Person {
    String name;
    long phone;
    String address;

    //Parameterized Constructor
    Person(String name_user,long phone_user,String address_user){
        this.name = name_user;
        this.phone = phone_user;
        this.address = address_user;
    }

}


