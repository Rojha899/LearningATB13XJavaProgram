package ex_19_OOPs_Inheritance.Single_Inheritance_01;

public class CommonToAll {
    // common function used while doing web automation - these are like father class
    void startBrowser(){
        System.out.println("Start the browser!");
    }
    void closeBrowser(){
        System.out.println("Closing browser!");
    }
    void readExcelFile(){
        System.out.println("Reading file!");
    }
    void readDataBaseFile(){
        System.out.println("Reading DB file!");
    }
}

