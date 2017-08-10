import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpreadsheetColumnEncodingTest {

	private String code;
	private int result;
	
	@Test 
	public void spreadsheetColumnEncoding1() {
		code = "B";
		result = 2;
		
		test(code, result);
	}
	
	@Test 
	public void spreadsheetColumnEncoding2() {
		code = "AA";
		result = 27;
		
		test(code, result);
	}
	
	@Test 
	public void spreadsheetColumnEncoding3() {
		code = "AAB";
		result = 26 + 26*26 + 2 ;
		
		test(code, result);
	}
	
	private void test(String code, int result) {
		assertEquals(SpreadsheetColumnEncoding.decodeSpreadsheetColumn(code), result);
	}
}