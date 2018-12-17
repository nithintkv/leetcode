import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void shouldBePalindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(12321));
    }
}