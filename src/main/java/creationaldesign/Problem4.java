package creationaldesign;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem4 {
    public static void main(String[] args) {
        String str = "aabb";
        int uniqueCharIndex = findUniQueCharacterWithSortedList(str);
        System.out.println("The Unique Character" + uniqueCharIndex);

        // int uniqueCharIndex1 = findUniQueCharacterWithOutSortedList(str);
        // int uniqueCharIndex1=findUnique(str);
        // System.out.println("The Unique Character" + uniqueCharIndex1);
    }

    private static int findUniQueCharacterWithOutSortedList(String str) {
        int index = -1;
        int counter = 0;
        if (!str.isEmpty()) {
            char[] uniqueCharArray = str.toCharArray();
            for (int i = 0; i <= uniqueCharArray.length - 1; i++) {
                for (int j = 1; j <= uniqueCharArray.length - 1; j++) {
                    if (i <= uniqueCharArray.length - 1) {
                        if (uniqueCharArray[i] == uniqueCharArray[j]) {
                            ++counter;
                        }
                    }
                    if (counter == 1) {
                        index = i;
                        break;
                    }
                }
                counter = 0;

            }
        }
        return index;
    }

    public static int findUnique(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }


        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        // find the index
        for (int i = 0; i < n; i++) {
            System.out.println("The value" + count.get(s.charAt(i)));
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

    private static int findUniQueCharacterWithSortedList(String str) {
        if (!str.isEmpty()) {
            char[] uniqueCharArray = str.toCharArray();
            Arrays.sort(uniqueCharArray);
            for (int i = 0; i <= uniqueCharArray.length - 1; i++) {
                if (uniqueCharArray[i] != uniqueCharArray[i + 1] && i <= uniqueCharArray.length - 1) {
                    return i;
                } else {
                    ++i;
                }
            }
        }
        return -1;
    }
}
