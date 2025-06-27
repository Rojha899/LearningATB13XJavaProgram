package ex_10_For_Loop;

public class Lab108_ForLoop_Condition {
    public static void main(String[] args) {
        int i = 10;
        for (; i > 0; i--){
            System.out.println(i);
        }
        // i      |  i > 0         | i--       |  o/p
        // 10     | 10 > 0 = True  |  9        | 10
        //  9     | 9 > 0  = True  |  8        | 9
        //  8     | 8 > 0  = True  |  7        | 8
        //  7     | 7 > 0  = True  |  6        | 7
        //  6     | 6 > 0  = True  |  5        | 6
        //  5     | 5 > 0  = True  |  4        | 5
        //  4     | 4 > 0  = True  |  3        | 4
        //  3     | 3 > 0  = True  |  2        | 3
        //  2     | 2 > 0  = True  |  1        | 2
        //  1     | 1 > 0  = True  |  0        | 1
        //  0     | 0 > 0  = False | Condition fails, come out of the loop
    }
}
