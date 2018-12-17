import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> remainingSum = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (remainingSum.get(target - nums[i]) != null) {
                return new int[]{remainingSum.get(target - nums[i]), i};
            } else {
                remainingSum.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}