package ex_14_Strings;

public class Lab143_String_Functions {
    public static void main(String[] args) {
        String name = "Sonal";
        System.out.println(name.length()); // Length = 5

        System.out.println(name.charAt(3)); // Sonal -> 0, 1,2,3,4 (Char starts with 0 indexing)at 3 a is present
        System.out.println(name.charAt(0)); // S character is at 0
        System.out.println(name.charAt(4)); // l
        //System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException - error is shown there is nothing at 10

        System.out.println(name.concat(" Patel ")); //Sonal Patel - after concatenation

        // 3. contains function
        System.out.println(name.contains("om")); // false - there is no om in sonal

        // 4. equals function
        System.out.println(name.equals("Sonal")); // true

        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("sonal")); // ignores sonal (actual - Sonal) and print true

        //6. indexOf() //  sonal -> ? o // index of character 'o' is 1
        System.out.println(name.indexOf('o')); //1

        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m")); // 0 - is the index value of m

        System.out.println(s1.lastIndexOf("m")); // this prints index of last m = 4

        // 7. length()
        System.out.println(name.length()); // length of sonal = 5

        // 8. replace( , ) // Sonal
        System.out.println(name.replace('n', 'N')); // SoNal

        // 9. Split - means cutting down
        String name4 = "pramod@live.com@123";
        String[] split_name4 = name4.split("@"); // this breaks/splits/cuts at @ pramod, live.com, 123
        System.out.println(split_name4[0]); // pramod
        System.out.println(split_name4[1]); // live.com
        System.out.println(split_name4[2]); // 123

        // 10. substring( , )  , Sonal
        System.out.println(name.substring(1, 3));// 0,1,2,3,4 -> on will be o/p 3 will not be included last index is -1

        // 11. toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // 12. toUpperCase()
        System.out.println("sonal".toUpperCase());

        // 13. startsWith()
        System.out.println(name.startsWith("S"));

        // 14. endsWith()
        System.out.println(name.endsWith("a"));

        String anotherPalindrome = "Niagara. O roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract); // roar

        //  15. Concatenation (By +)

        String s111 = "Hello";
        String s222 = "World";

        String s333 = "ji";
        String result1 = s111 + s333 + s222;
        System.out.println(result1); // HellojiWorld

        String n = "PRamoddUTTA";
        System.out.println(n.indexOf("d")); // 5
        System.out.println(n.lastIndexOf("d")); // 6
        System.out.println(n.lastIndexOf("s")); // -1


    }
}
