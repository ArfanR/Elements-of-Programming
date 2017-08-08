import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsInASentenceTest {

    private String expected;
    private String input;
    
    
    private void test(String expected, String input) {
    	assertEquals(ReverseWordsInASentence.reverseWordsInASentence(input), expected);
    }
}