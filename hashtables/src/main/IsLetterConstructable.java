import java.util.*;

public class IsLetterConstructable {

    /*
    12.2
    */

    public static boolean isConstructable(String letterText, String magazineText) {
    	Map<Character, Integer> charFrequencyForLetter = new HashMap<>();
    	for (int i = 0; i < letterText.length(); i++) {
    		char c = letterText.charAt(i);
    		if (charFrequencyForLetter.containsKey(c)) {
    			charFrequencyForLetter.put(c, 1);
    		}
    		else {
    			charFrequencyForLetter.put(c, charFrequencyForLetter.get(c) + 1);
    		}
    	}
    	
    	for (char c: magazineText.toCharArray()) {
    		if (charFrequencyForLetter.containsKey(c)) {
    			charFrequencyForLetter.put(c, charFrequencyForLetter.get(c) - 1);
    			if (charFrequencyForLetter.get(c) == 0) {
    				charFrequencyForLetter.remove(c);
    				if (charFrequencyForLetter.isEmpty()) {
    					break;
    				}
    			}
    		}
    	}
    	
    	return charFrequencyForLetter.isEmpty();
    }
}