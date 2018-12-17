import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void shouldReturnMinimumCost() {
        Solution solution = new Solution();
        int actual = solution.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        assertEquals(6, actual);
    }
}