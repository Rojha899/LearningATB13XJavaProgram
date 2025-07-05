package ex_19_OOPs_Inheritance.Single_Inheritance_01;

public class TestCase1 extends CommonToAll{ // this test case is inheriting commontoall class (superclass)

    void runningTC1(){
        startBrowser(); // These are coming from commontoall class
        System.out.println("TC1 is running");
        closeBrowser(); // from common to all class


    }
}
