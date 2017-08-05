public class InterconvertStringAndInteger {

    /*
    6.1
    */

    public static Integer stringToInt(String number) {
    	Integer num = new Integer(0);
    	int i = 0; 
    	boolean isNeg = false;
    	if (number.charAt(0) == '-') {
    		isNeg = true;
    		i = 1;
    	}
    	while (i < len) {
    		num *= 10;
    		num += (number.charAt(i++) - '0');
    	}
    	if (isNeg) {
    		num = -1*num;
    	}
    	return num;
    }

    public static String intToString(Integer number) {

        return "";
    }

}