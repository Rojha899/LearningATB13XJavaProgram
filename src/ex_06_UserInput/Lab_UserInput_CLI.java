package ex_06_UserInput;

public class Lab_UserInput_CLI {
    public static void main(String[] args) {
        String age_string = args[0];
        System.out.println(age_string); // 30 is provided as argument
        int age = Integer.parseInt(age_string);
        String canIvote = age>18 ? "Yes" : "No";
        System.out.println(canIvote);

        // Go to edit config --> Enter CLI argument value ex- I provided argument value = 30
        // 30 will be available under PSVM agrs which is string type -> (String[] args)
        // we have to convert string to integer see line 5 & 6

    }
}
