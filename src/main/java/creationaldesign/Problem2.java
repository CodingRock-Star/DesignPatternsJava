package creationaldesign;

import java.util.Arrays;


public class Problem2 {
    public static void main(String[] args) {
        String str = "anagram";
        String str1 = "margana";
        boolean isAnagram = checkAnaGram(str, str1);
        if (isAnagram) {
            System.out.println("The Strings are AnaGram");
        } else {
            System.out.println("The String are not AnaGram");
        }
    }

    private static boolean checkAnaGram(String str, String str1) {
        int length = str.length();
        int length1 = str1.length();
        if (length != length1) {
            return false;
        }
        char[] charArray = str.toCharArray();
        char[] charArray1 = str1.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        int counter = 0;
        for (int i = 0; i < length; i++) {
            if (charArray[i] != charArray1[i]) {
                ++counter;
                break;
            }
        }
        return counter == 0;
    }

}
