package ex_32_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class Coding_Question_FrequencyCount_Char {
    public static void main(String[] args) {
       // Write a method to find the frequency of each character in a string using a HashMap
        String input = "programming";

        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            // p,r,o,g,r.....
            // p : 1
            // r : 1+1 = 2
            // o : 1
            // g : 2
            // a : 1
            // m : 2
            // i : 1
            // n : 1



            freqMap.put(c, freqMap.getOrDefault(c,0) + 1);
        }

        System.out.println(freqMap);
    }
}
