public class Solution {
    public boolean isPalindrome(int num) {
        if (num < 0)
            return false;
        int divisor = 1;
        while (num / divisor >= 10)
            divisor *= 10;

        while (num != 0) {
            int leading = num / divisor;
            int trailing = num % 10;

            if (leading != trailing)
                return false;

            num = (num % divisor) / 10;
            divisor = divisor / 100;
        }
        return true;
    }
}
