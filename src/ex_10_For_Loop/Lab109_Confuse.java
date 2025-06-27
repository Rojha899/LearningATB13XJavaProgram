package ex_10_For_Loop;

public class Lab109_Confuse {
    public static void main(String[] args) {
        // While initializing for loop from 0 (int i=0;) then in condition never use = that is (i<=10) coz,
        // it runs 11 times from 0-10, but we want to run 10 times only so, use i < 10.

        //for(int i=0;i<=10;i++) // 0 to 10, runs 11 times - not advisable due to = in condition
            for (int i=0; i<10; i++){
                System.out.println(i);
            }
            // When initialization starts from 1 as shown below you can use = sign in condition
            for (int i=1; i<=10; i++){
                System.out.println(i);
            }
        }
    }

