import java.util.*;

public class BaseConversion {
	
	/*
    6.2
    */

    public static String baseConversion(String s, int b1, int b2) {
    	int numAsInt = 0;
    	// convert to num in base 10
    	for (int i = s.charAt(0) == '-' ? 1 : 0; i < s.length(); i++) {
    		numAsInt *= b1;
    		int digit = s.charAt(i) - '0';
    		numAsInt = numAsInt + digit;
    	}
    	// build the string in new base
    	StringBuilder sb = new StringBuilder();
    	int convertNum = numAsInt;
    	while (convertNum != 0) {
    		sb.append((char) (convertNum % b2 >= 10 ? 
    				'A' + convertNum % b2 - 10 : 
    					convertNum % b2 + '0'));
    		convertNum /= b2;
    	} 
    	sb.reverse();
    	return (numAsInt == 0) ? "0" : ((s.charAt(0) == '-' ? "-" : "") + sb.toString());
    }
    
}