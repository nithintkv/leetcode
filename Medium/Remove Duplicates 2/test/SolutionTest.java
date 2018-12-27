import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void shouldReturnIndexAfterRemoving() {
        Solution solution = new Solution();
        solution.removeDuplicates(new int[]{1,1,1,2,2,3,3,3,4});
    }
}