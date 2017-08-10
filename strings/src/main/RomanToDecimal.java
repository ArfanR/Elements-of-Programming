import java.util.*;

public class RomanToDecimal {

    /*
    6.9
    */

    public static int romanToDecimal(String roman) {
    	Map<Character, Integer> T = new HashMap<Character, Integer>() {
    	{
    		put('I', 1);
    		put('V', 5);
    		put('X', 10);
    		put('L', 50);
    		put('C', 100);
    		put('D', 500);
    		put('M', 1000);
    	}};
    	int sum = T.get(roman.charAt(roman.length() - 1));
    	for (int i = roman.length() - 2; i >= 0; --i) {
    		if (T.get(roman.charAt(i)) < T.get(roman.charAt(i + 1))) {
    			sum -= T.get(roman.charAt(i));
    	    } 
    		else {
    			sum += T.get(roman.charAt(i));
    	    }
    	 }
    	return sum;  
    }
}