package creationaldesign;

import java.util.HashSet;

public class Problem8 {
    public static void main(String[] args) {
        int[] duplicateElements = {1, 2, 2, 3, 4, 5, 5, 5, 5, 6, 7};

        int[] duplicatedElementsVersionI = extracted(duplicateElements);
        for (int i : duplicatedElementsVersionI) {
            System.out.println(duplicatedElementsVersionI[i]);
        }

        int j=removeduplicates(duplicateElements,duplicateElements.length);
        // Printing The array elements
        for (int i = 0; i < j; i++)
            System.out.print(duplicateElements[i] + " ");
    }

//        try {
//            Object[] array = removeDuplicates(duplicateElements);
//            if (array.length >= 1) {
//                for (Object j : array) {
//
//                    System.out.println("Elements after removing duplicates" + j);
//                }
//            } else {
//                System.out.println("No Duplicate Elements removed.......");
//            }
//        } catch (Exception e) {
//            System.out.println("The Exception is received..." + e.getMessage());
//        }
//    }

    private static int[] extracted(int[] duplicateElements) {

        int size = duplicateElements.length;
        int []removeDuplicate = new int[size];
        int j = 0;
        for (int i = 0; i < size - 1; i++) {
            if (duplicateElements[i] != duplicateElements[i + 1]) {
                removeDuplicate[j++] = duplicateElements[i];
            }
        }

        removeDuplicate[j++] = duplicateElements[size - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            duplicateElements[i] = removeDuplicate[i];
        }

        return removeDuplicate;
    }

    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }

        // creating another array for only storing
        // the unique elements
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                temp[j++] = a[i];
            }
        }

        temp[j++] = a[n - 1];

        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = temp[i];
        }

        return j;
    }
    private static Object[] removeDuplicates(int[] duplicateElements) {
        HashSet<Integer> integerHashSet = new HashSet<>();
        if (duplicateElements != null && duplicateElements.length >= 1) {
            for (int i = 0; i <= duplicateElements.length - 1; i++) {
                integerHashSet.add(duplicateElements[i]);
            }
            return integerHashSet.toArray();
        }
        return null;
    }
}
