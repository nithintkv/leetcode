public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp1 = 0, dp2 = 0;

        for (int i = 0; i < cost.length; i++) {
            int dp0 = cost[i] + Math.min(dp1, dp2);
            dp2 = dp1;
            dp1 = dp0;
        }
        return Math.min(dp1, dp2);
    }
}
