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

    public static String intToString(Integer number) {

        return "";
    }

}