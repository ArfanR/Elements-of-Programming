import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DeleteDuplicatesTest {
	
	private List<Integer> input;
	private List<Integer> deleted;
	
	@Test
	public void deleteDuplicates1() {
		input = Arrays.asList(2,3,5,5,7,11,11,11,13);
		deleted = Arrays.asList(2,3,5,7,11,13,0,0,0);
		
		test(input,deleted);
	}
	
	@Test
	public void deleteDuplicates2() {
		input = Arrays.asList(1,1,1,1);
		deleted = Arrays.asList(1,0,0,0);
		
		test(input,deleted);
	}
	
	@Test
	public void deleteDuplicates3() {
		input = Arrays.asList(1);
		deleted = Arrays.asList(1);
		
		test(input,deleted);
	}
	
	@Test
	public void deleteDuplicates4() {
		input = Arrays.asList(1,2,4,5);
		deleted = Arrays.asList(1,2,4,5);
		
		test(input,deleted);
	}
	
	private void test(List<Integer> input, List<Integer> deleted) {
		assertEquals(DeleteDuplicates.deleteDuplicates(input), deleted);
	}
}