class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;

        int count = 0, currentElement = nums[0];
        int i = 0, j = 0;
        while (j < nums.length) {
            if (currentElement == nums[j]) {
                if (count < 2) {
                    nums[i] = nums[j];
                    count++;
                    i++;
                    j++;
                } else j++;
            } else {
                currentElement = nums[j];
                count = 1;
                nums[i] = nums[j];
                i++;
                j++;
            }
        }
        return i;
    }
}