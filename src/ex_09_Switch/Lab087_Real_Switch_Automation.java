package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {
    public static void main(String[] args) {
        // Web Automation
        // I will ask the user to give me the input from browser which he wants to run
        // I will start the automation in that browser only.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser which you want to start!");
        String browser = scanner.next(); // scanner.next() is used because we want string data
        browser = browser.toLowerCase(); //This is used to convert char (browser name in this case) to lower case

        switch (browser){
            case "chrome":
                System.out.println("Starting the browser");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "edge":
                System.out.println("Start the edge browser");
                break;
            case "firefox":
                System.out.println("Start firefox browser");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;

        }

    }
}
