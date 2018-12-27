class Solution {
    public int[] sortArrayByParity(int[] A) {
        if (A.length < 2) return A;
        int i = 0, j = A.length-1;
        while (i < j) {
            if (A[i] % 2 == 0)
                i++;
            else {
                while (i < j && A[j] % 2 != 0)
                    j--;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }

            if (A[j] % 2 == 1)
                j--;
            else {
                while (i < j && A[i] % 2 != 1)
                    i++;
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }

        return A;
    }
}