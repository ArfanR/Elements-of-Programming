import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InterconvertStringAndIntegerTest {
	
	private String s;
	private int number;
	
	@Test
	public void stringToInteger1() {
		s = "1234";
		number = 1234;
		
		testStringToInt(s, number);
	}
	
	@Test
	public void stringToInteger2() {
		s = "-1234";
		number = -1234;
		
		testStringToInt(s, number);
	}
	
	@Test
	public void stringToInteger3() {
		s = "0";
		number = 0;
		
		testStringToInt(s, number);
	}
	
	@Test
	public void stringToInteger4() {
		s = "1";
		number = 1;
		
		testStringToInt(s, number);
	}
	
	private void testStringToInt(String s, int number) {
		assertEquals(InterconvertStringAndInteger.stringToInt(s), number);
	}
	
}