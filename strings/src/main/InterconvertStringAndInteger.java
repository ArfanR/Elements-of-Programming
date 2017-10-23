import java.util.*;

public class InterconvertStringAndInteger {

    /*
    6.1
    */

    public static int stringToInt(String s) {
    	int result = 0;
    	for (int i = s.charAt(0) == '-' ? 1 : 0; i < s.length(); i++) {
    		final int digit = s.charAt(i) - '0';
    		result = result * 10 + digit;
    	}
    	return s.charAt(0) == '-' ? -result : result;
    }

    public static String intToString(Integer num) {
    	boolean isNegative = false;
        if (num < 0) {
          isNegative = true;
        }

        StringBuilder s = new StringBuilder();
        do {
          s.append((char)('0' + Math.abs(num % 10)));
          num /= 10;
        } while (num != 0);

        if (isNegative) {
          s.append('-'); // Adds the negative sign back.
        }
        s.reverse();
        return s.toString();
    }

}