import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseConversionTest {

    private String expected;
    private String input;
    private int b1;
    private int b2;
    
    @Test
    public void baseConversion1() {
    	input = "615";
    	expected = "1A7";
    	b1 = 7;
    	b2 = 13;
    	
    	test(input, b1, b2, expected);
    }
    
    @Test
    public void baseConversion2() {
    	input = "-615";
    	expected = "-1A7";
    	b1 = 7;
    	b2 = 13;
    	
    	test(input, b1, b2, expected);
    }
    
    @Test
    public void baseConversion3() {
    	input = "0";
    	expected = "0";
    	b1 = 7;
    	b2 = 13;
    	
    	test(input, b1, b2, expected);
    }
    
    private void test(String input, int b1, int b2, String expected) {
    	assertEquals(BaseConversion.baseConversion(input, b1, b2), expected);
    }
    
}