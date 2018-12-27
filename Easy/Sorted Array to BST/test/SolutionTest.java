import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void shouldReturnBST() {
        Solution solution = new Solution();
        solution.sortedArrayToBST(new int[]{-10,-3,0,5,9});
    }
}