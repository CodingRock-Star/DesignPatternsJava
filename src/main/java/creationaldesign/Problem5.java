package creationaldesign;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem5 {
    private static final String EMPTY = "";

    public static void main(String[] args) {
        System.out.println("The coding challenge problem...");
        Scanner str = new Scanner(System.in);
        char [] s={'d','h','i','r','a','j'};
        reverse(s);

        boolean validPalindrome = checkValidPalindrome("A man, a plan, a canal: Panama");
        if (validPalindrome) {
            System.out.println("Is a palindrome...");
        } else {
            System.out.println("Is not a palindrome...");
        }
    }

    private static boolean checkValidPalindrome(String str) {

        char[] palindromeArray = createPalindromeArray(str);
        //check the palindrome....
        int i = 0, j;
        if (palindromeArray.length == 0) {
            return true;
        } else if (palindromeArray.length > 1) {
            j = palindromeArray.length - 1;
            while (i < j) {
                if (palindromeArray[i] != palindromeArray[j]) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    private static char[] createPalindromeArray(String str) {
        if (!str.isEmpty()) {
            String s = str.replaceAll("[^a-zA-Z]+", "");
            return s.toLowerCase().toCharArray();
        }
        return new char[0];
    }

    public static String pattern(String str) {
        Pattern pt = Pattern.compile("[a-zA-Z0-9]+");
        Matcher match = pt.matcher(str);
        while (true) {
            if (!match.find()) break;
            String s = match.group();
            str = s.replaceAll("\\s", "");
            return str.toLowerCase();
        }

        return EMPTY;
    }

    private static void reverse(char[] s) {
        int i,j;
        char[] k = Arrays.copyOf(s, s.length );
        i=0;

       for(j=s.length-1;j>=0;j--){
            s[i]=k[j];
            ++i;
        }

        for(int l=0;l<k.length;l++){
            System.out.println(s[l]);
        }

    }

}


