import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println("The Missing..");
        int[] array = {0};
        int missingNum = FindMissingNumber(array);
        System.out.println("Number is" + missingNum);
    }

    private static int FindMissingNumber(int[] elements) {
        int[] rangeArray = calculateRangeArray(elements);
        int size = rangeArray.length;
        if (elements.length == 2) {
            return 2;
        } else if (elements.length == 1) {
            return 1;
        } else {
            for (int i = 0; i < size; i++) {
                if (rangeArray[i] != elements[i]) {
                    return rangeArray[i];
                }
            }
        }
        return 0;
    }

    private static int[] calculateRangeArray(int[] elements) {
        //Elements are sorted..
        int firstElement = 0;
        int size = 0;
        int lastElement = 0;
        if (elements != null && elements.length >= 1) {
            Arrays.sort(elements);
            firstElement = elements[0];
            size = elements.length;
            lastElement = elements[size - 1];
        }
        int[] rangeArray = new int[lastElement];
        int i = 0;
        while (firstElement < lastElement) {
            rangeArray[i] = firstElement;
            ++firstElement;
            i++;
        }
        return rangeArray;
    }
}
