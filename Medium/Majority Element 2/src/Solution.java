import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        List<Integer> result = new ArrayList<>();

        for (int num : nums) {
            if (first == num) {
                count1++;
            } else if (second == num) {
                count2++;
            } else if (count1 == 0) {
                first = num;
                count1++;
            } else if (count2 == 0) {
                second = num;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = count2 = 0;

        for (int num: nums) {
            if (num == first)
                count1++;
            else if (num == second)
                count2++;
        }

        if (count1 > nums.length/3)
            result.add(first);
        if (count2 > nums.length/3)
            result.add(second);

        return result;
    }
}
