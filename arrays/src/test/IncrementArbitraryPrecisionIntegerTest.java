import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IncrementArbitraryPrecisionIntegerTest {

    private List<Integer> input;
    private List<Integer> incremented;

    @Test
    public void incrementInteger1() {
        input = Arrays.asList(1, 2, 9);
        incremented = Arrays.asList(1, 3, 0);
        test(input,incremented);
    }

    @Test
    public void incrementInteger2() {
        input = Arrays.asList(9,9,9,9,9,9,9);
        incremented = Arrays.asList(1,0,0,0,0,0,0,0);
        test(input,incremented);
    }

    @Test
    public void incrementInteger3() {
        input = Arrays.asList(8,9,9,9,9,9,9);
        incremented = Arrays.asList(9,0,0,0,0,0,0);
        test(input,incremented);
    }

    @Test
    public void incrementInteger4() {
        input = Arrays.asList(0,1,2,3);
        incremented = Arrays.asList(1,2,4);
        test(input,incremented);
    }

    @Test
    public void incrementInteger5() {
        input = Arrays.asList(0,0,1,2,3);
        incremented = Arrays.asList(1,2,4);
        test(input,incremented);
    }


    private void test(List<Integer> input, List<Integer> incremented) {
        assertEquals(incremented, IncrementArbitraryPrecisionInteger.incrementInteger(input));
    }


}