package ex_20_OOPs_Polymorphism.Methodoverloading;

public class WebAutomation {
    public static void main(String[] args) {
        Browser b1 = new Browser();
        b1.startBrowser("chrome");
    }


}
class Browser{
    void starBrowser(){
        System.out.println("Starting a default browser");
    }
    String startBrowser(String browser){
        System.out.println("Starting Browser " + browser);
        return browser;
    }
}
