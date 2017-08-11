import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;

public class LookAndSayProblemTest {

	String say;
	int n;
	
	@Test
	public void lookAndSay1() {
		n = 2;
		say = "11";
		
		test(say, n);
	}
	
	@Test
	public void lookAndSay2() {
		n = 4;
		say = "1211";
		
		test(say, n);
	}
	
	@Test
	public void lookAndSay3() {
		n = 6;
		say = "312211";
		
		test(say, n);
	}
	
	private void test(String say, int n) {
		assertEquals(LookAndSayProblem.lookAndSay(n), say);
	}
}