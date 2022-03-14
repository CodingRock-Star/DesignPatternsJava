import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem1 {
    //Problem one....

    public static void main(String[] args) {
        System.out.println("The problem starts");
        String[] words = {"bella", "roller", "label"};
       // List<String> uniqueList = findUniqueCharacterFromStringArray(words);
       List<String>commonCharList=findCommonCharacterFromStingArray(words);
        if (!commonCharList.isEmpty()) {
            for (String i : commonCharList) {
                System.out.println("The Unique List" + i);
            }
        } else {
            System.out.println("Oops the List does not have unique character.");
        }
    }

    private static List<String> findCommonCharacterFromStingArray(String[] words) {
        List<String>commonCharacterList=new ArrayList<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
  int num;
        for (int i = 0, alphabetLength = alphabet.length; i < alphabetLength; i++) {
            num=0;
            char value = alphabet[i];
            for (int j = 0, wordsLength = words.length; j < wordsLength; j++) {
                String word = words[j];
                char[] singleWord = word.toCharArray();
                for (int k = 0, singleWordLength = singleWord.length; k < singleWordLength; k++) {
                    char c = singleWord[k];
                    if (value == c ) {
                        ++num;

                    }
                }
            }
            if (num == words.length) {
                String c = String.valueOf(value);
                commonCharacterList.add(c);
            }

        }

        return commonCharacterList;
    }

    private static List<String> findUniqueCharacterFromStringArray(String[] words) {
        List<String> uniqueList = new ArrayList<>();
        String uniqueCharacter;
        for (String i : words) {
            uniqueCharacter = findUniqueCharacterFromSingleWord(i);
            if (!uniqueCharacter.isEmpty()) {
                uniqueList.add(uniqueCharacter);
            }
        }

        return uniqueList;
    }

    private static String findUniqueCharacterFromSingleWord(String singleWord) {
        if (singleWord != null) {

            char[] singleWordArray = singleWord.toCharArray();
            //sorting array
            Arrays.sort(singleWordArray);
            int k = 0;

            char[] uniqueCharacter = new char[singleWordArray.length];
            char[] compareSingleWordArray = Arrays.copyOf(singleWordArray, singleWordArray.length + 1);
            for (int i = 0; i < singleWordArray.length; i++) {

                if (singleWordArray[i] != compareSingleWordArray[i + 1] && singleWordArray[i] != '0') {
                    uniqueCharacter[k] = singleWordArray[i];
                    ++k;
                } else {
                    ++i;
                }

            }
            return Arrays.toString(uniqueCharacter);
        }
        return "";
    }
}
