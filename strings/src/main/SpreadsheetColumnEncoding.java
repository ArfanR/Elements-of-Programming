import java.util.*;

public class SpreadsheetColumnEncoding {

    /*
    6.3
    */

    public static int decodeSpreadsheetColumn(String code) {
    	int result = 0;
    	for (int i = 0; i < code.length(); i++) {
    		char c = code.charAt(i);
    		result = result * 26 + (int) c - 'A';
    	}
    	return result;
    }
    
    // Variant: integer to string spreadsheet column
    public static String encodeSpreadsheetColumn(int code) {
        StringBuilder column = new StringBuilder();
        while (code != 0) {
        	column.append((char)(code % 26 + 'A' - 1));
        	code /= 26;
        }
        column.reverse();
        return column.toString();
    }


}