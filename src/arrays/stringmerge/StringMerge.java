package arrays.stringmerge;

import java.util.Arrays;

public class StringMerge {

    static String merge(String left, String right, char mergeLetter) {
        char[] leftChars = left.toCharArray();
        char[] rightChars = right.toCharArray();
        char[] result = new char[leftChars.length + rightChars.length];
        int n = 0;
        while (leftChars[n] != mergeLetter) {
            //System.out.print(leftChars[n]);
            result[n] = leftChars[n];
            n++;
        }
        result[n] = mergeLetter;
        n++;

        boolean toCopy = false;
        for (char rightChar : rightChars) {
            //////////////
            if (toCopy) {
                result[n] = rightChar;
                n++;
            }
            if (rightChar == mergeLetter) {
                toCopy = true;
            }
        }

        return String.valueOf(Arrays.copyOfRange(result, 0, n));
    }

    public static String stringMerge(String s1, String s2, char letter) {
        return s1.substring(0, s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
    }

    public static void main(String[] args) {
        System.out.println(merge("hello", "world", 'l'));
        System.out.println(merge("coding", "anywhere", 'n'));
        System.out.println(stringMerge("coding", "anywhere", 'n'));

    }
}
