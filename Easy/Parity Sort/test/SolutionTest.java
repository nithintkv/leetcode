import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void shouldReturnParitySortedArray() {
        Solution solution = new Solution();
        int[] actual = solution.sortArrayByParity(new int[]{3,1,2,4});
        assertArrayEquals(new int[]{3,1,2,4}, actual);
    }
}