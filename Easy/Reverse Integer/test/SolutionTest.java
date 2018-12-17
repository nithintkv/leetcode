import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void shouldReverseNumber() {
        Solution solution = new Solution();
        assertEquals(solution.reverse(-123456789), -987654321);
    }

    @Test
    public void shouldReturnZeroIfOverflows() {
        Solution solution = new Solution();
        assertEquals(solution.reverse(1123456789), 0);
    }

    @Test
    public void shouldReverseWithoutZero() {
        Solution solution = new Solution();
        assertEquals(solution.reverse(120), 21);
    }
}