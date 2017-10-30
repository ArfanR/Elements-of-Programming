import java.util.*;

public class PalindromicPermutations {

    /*
    12.1
    */

    public static boolean canFormPalindrome(String s) {
    	Set<Character> charsWithOddFrequency = new HashSet<>();
    	for (int i = 0; i < s.length(); i++) {
    		char c = s.charAt(i);
    		if (charsWithOddFrequency.contains(c)) {
    			charsWithOddFrequency.remove(c);
    		}
    		else {
    			charsWithOddFrequency.add(c);
    		}
    	}
    	return charsWithOddFrequency.size() <= 1;
    }
}