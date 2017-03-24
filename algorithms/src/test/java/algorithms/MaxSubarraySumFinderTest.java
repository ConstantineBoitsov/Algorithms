package algorithms;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Константин on 19.03.2017.
 */
public class MaxSubarraySumFinderTest {

    @Test
    public void testFindMaxSubarraySum() {

        double[] array;

        array = new double[] {-1.23, 1.56, 0.13, 2.00, -3.96, -1.20, -2.01, 3.07, -1.67, 1.12};
        assertEquals(3.69, MaxSubarraySumFind.findMaxSubarraySum(array), 1e-3);

        array = new double[] {-100.88, 86.91, 91.58, -22.71, 44.55, 74.68, 28.07, 64.93};
        assertEquals(368.01, MaxSubarraySumFind.findMaxSubarraySum(array), 1e-3);

        array = new double[] {-42.12, -10.44, -0.11, -85.81, -17.21, -0.16, -7.77, -1.07, -52.67, -49.97};
        assertEquals(-0.11, MaxSubarraySumFind.findMaxSubarraySum(array), 1e-3);

        array = new double[] {0.12, -4.52, 3.78, 0.32, -1.47, 2.03, 1.01, -5.68, 1.73, 0.13};
        assertEquals(5.67, MaxSubarraySumFind.findMaxSubarraySum(array), 1e-3);

    }

}
