public class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        memo[0] = memo[1] = 1;
        return climb(n, memo);
    }

    public int climb(int n, int[] memo) {
        if (memo[n] > 0)
            return memo[n];
        memo[n] = climb(n - 1, memo) + climb(n - 2, memo);
        return memo[n];
    }
}
