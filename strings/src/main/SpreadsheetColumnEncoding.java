public class SpreadsheetColumnEncoding {

    /*
    6.3
    */

    public static int decodeSpreadsheetColumn(String code) {
    	int result = 0;
    	for (int i = 0; i < code.length(); i++) {
    		char c = code.charAt(i);
    		result = result * 26 + (int) c - 64 + 1;
    	}
    	return result;
    }


}