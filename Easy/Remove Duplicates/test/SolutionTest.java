import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void shouldReturnTrimmedIndex() {
        Solution solution = new Solution();
        int actual = solution.removeDuplicates(new int[]{1,1,2});
        assertEquals(2, actual);
    }
}