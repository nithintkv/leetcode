import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void shouldReturnTwoMajorities() {
        Solution solution = new Solution();
        List<Integer> result = solution.majorityElement(new int[]{1,2});
        assertEquals(Arrays.asList(1,2), result);
    }
}