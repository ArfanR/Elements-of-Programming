import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdvanceThroughArrayTest {
	
	private List<Integer> input;
	
	@Test
    public void advanceThroughArray1() {
        input = Arrays.asList(3,3,1,0,2,0,1);
     
        test(input,true);
    }
	
	@Test
    public void advanceThroughArray2() {
        input = Arrays.asList(3,2,0,0,2,0,1);
     
        test(input,false);
    }
	
	@Test
    public void advanceThroughArray3() {
        input = Arrays.asList(1);
     
        test(input,true);
    }
	
	private void test(List<Integer> input, boolean possible) {
		assertEquals(AdvanceThroughArray.arrayAdvance(input), possible);
	}
	
}