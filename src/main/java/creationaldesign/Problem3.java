package creationaldesign;

public class Problem3 {
    public static void main(String[] args) {
        int[] elements = {1, 2, 1, 1, 2, 3, 4, 5, 6, 4, 3, 2, 3, 4, 2, 4, 4, 4};
        int majorityElement = majorityElement(elements);
        System.out.println("The Majority Element" + majorityElement);
    }

    private static int majorityElement(int[] nums) {
        int element = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0)
                element = nums[i];
            if (element == nums[i])
                count++;
            else
                count--;
        }
        return element;

    }
}
