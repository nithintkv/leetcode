class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        return longestCommonPrefix(strs, 0, strs.length-1);
    }

    private String longestCommonPrefix(String[] strs, int l, int r) {
        if (l == r)
            return strs[l];

        int mid = (l+r)/2;
        String left = longestCommonPrefix(strs, l, mid);
        String right = longestCommonPrefix(strs, mid+1, r);
        return findPrefix(left, right);
    }

    private String findPrefix(String left, String right) {
        int leftLength = left.length();
        int rightLength = right.length();
        int i = 0;
        while (i < leftLength && i < rightLength) {
            if (left.charAt(i) == right.charAt(i))
                i++;
            else return left.substring(0, i);
        }

        return left.substring(0, Math.min(left.length(), right.length()));
    }
}
