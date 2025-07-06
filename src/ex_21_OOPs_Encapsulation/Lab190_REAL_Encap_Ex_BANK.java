package ex_21_OOPs_Encapsulation;

public class Lab190_REAL_Encap_Ex_BANK {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 100);
        long bal = amit.getBal();
        System.out.println(bal);

        amit.setBal(200, false); // since amit is not cashier can not change bal
        long bal2 = amit.getBal();
        System.out.println(bal2);

        amit.setBal(600, true); // since amit is a cashier bal is changed
        long bal3 = amit.getBal();
        System.out.println(bal3);

    }

}
class ICICIBank{
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier){
            this.bal = bal;
        }
        else {
            System.out.println("Not allowed to change balance");
        }

    }
}
