package ex_21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {
    public static void main(String[] args) {
        VWOlogin vwologin = new VWOlogin("admin", "pass123");
        System.out.println(vwologin.password);
        vwologin.password = "345";
        System.out.println(vwologin.password);

        GoodVWOLogin vwoLogin1 = new GoodVWOLogin("admin", "pwd123");
        vwoLogin1.setPassword("pass1234", false);// if admin is false can't change pswd, if true you can
        String pass = vwoLogin1.getPassword();
        System.out.println(pass);

    }

}
class VWOlogin{
    public String username;
    public String password;

    // To Select parameterised constructor
    // right click -> click on 'Generate" -> then click on "Constructor" ->

    public VWOlogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
// Above example is not a perfect encapsulate example - coz anyone can change the password or username
// Below we will see a perfect encapsulated example

class GoodVWOLogin{
    // Instance Variable | Data variable | Attribute | Fields |  properties | member variables -> Should be private
    private String username;
    private String password;

    //parameterised constructor


    public GoodVWOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    // Getter setter - used to create behaviour
    // Right click -> Generate -> Getter & Setter -> select -> click ok
    // Below you can see 4 behaviours/functions are created -
    // 1. getUsername()
    // 2. setUsername(String username)
    // 3. getPassword()
    // 4. setPassword(String password)

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin){
            this.password = password;
        }
        else {
            System.out.println("Can't change password");
        }

    }
}