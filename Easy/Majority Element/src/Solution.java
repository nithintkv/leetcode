class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer currentMajority = null;


        for (int num : nums) {
            if (count == 0) {
                currentMajority = num;
            }
            count += (num == currentMajority) ? 1 : -1;
        }

        return currentMajority;
    }
}