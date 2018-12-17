import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void shouldReturnSteps() {
        Solution solution = new Solution();
        assertEquals(8, solution.climbStairs(5));
    }
}