import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void shouldGetMaxSum() {
        Solution solution = new Solution();
        int sum = solution.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
         assertEquals(6, sum);
    }
}