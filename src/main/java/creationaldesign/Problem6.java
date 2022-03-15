package creationaldesign;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem6 {
    public static void main(String[] args) {
        int[] elements = {1,1, 4, 2, 3};
        boolean containsDuplicates = findDuplicate(elements);
        if (containsDuplicates) {
            System.out.println("Elements contains duplicates");
        } else {
            System.out.println("No Elements are duplicated..");
        }
    }

    private static boolean findDuplicate(int[] elements) {

        Arrays.sort(elements);
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = elements.length;
        for (int item : elements) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        for (int element : elements) {
            if ( map.get(elements[element])!=null&& map.get(elements[element]) > 1)
                return true;
            break;
        }
        return false;
    }
}
