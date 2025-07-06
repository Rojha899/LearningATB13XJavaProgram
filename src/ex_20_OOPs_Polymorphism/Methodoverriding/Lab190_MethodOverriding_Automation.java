package ex_20_OOPs_Polymorphism.Methodoverriding;

public class Lab190_MethodOverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        CommonToAll c2 = new CommonToAll();
        c2.openBrowser();

        Firefox f1 = new Firefox();
        f1.openBrowser();

        // Dynamic Dispatch
        CommonToAll c3 = new ChromeTC();
        c3.openBrowser();

        CommonToAll c4 = new Firefox();
        c4.openBrowser();
    }

}
class CommonToAll{
    void openBrowser(){
        System.out.println("IE Browse");
    }
}
class ChromeTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Start chrome browser");
    }

}
class Firefox extends CommonToAll {
    @Override
    void openBrowser() {
        System.out.println("Start firefox browser");
    }
}
