class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;

        int whereToPut = 1, replacingNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != replacingNumber) {
                if (whereToPut != i)
                    nums[whereToPut] = nums[i];
                replacingNumber = nums[i];
                whereToPut++;
            }
        }
        return whereToPut;
    }
}