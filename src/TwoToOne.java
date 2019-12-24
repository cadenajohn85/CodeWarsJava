// Take 2 strings s1 and s2 including only letters from ato z. Return a new sorted string, the longest possible,
// containing distinct letters, each taken only once - coming from s1 or s2.

import java.util.Arrays;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        String output = "";
        String combined = s1 + s2;
        for (int i = 0; i < combined.length(); i++) {
            if (output.indexOf(combined.charAt(i)) == -1) {
                output += combined.charAt(i);
            }
        }
        char[] sorted = output.toCharArray();
        Arrays.sort(sorted);
        return new String(sorted);
    }

    public static void main (String[] args) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

}