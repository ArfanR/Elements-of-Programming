import java.util.*;

public class ReplaceAndRemove {
	
	 /*
    6.4
    */

    public static String replaceAndRemove(char[] s, int size) {
    	// Forward iteration: remove "b"s and count the number of "a"s.
        int writeIdx = 0, aCount = 0;
        for (int i = 0; i < size; ++i) {
        	if (s[i] != 'b') {
        		s[writeIdx++] = s[i];
        	}
        	if (s[i] == 'a') {
        		++aCount;
        	}	
        }
        if (writeIdx == 0) return "";
        // Backward iteration: replace "a"s with "dd"s starting from the end.
        int curIdx = writeIdx - 1;
        writeIdx = writeIdx + aCount - 1;
        while (curIdx >= 0) {
        	if (s[curIdx] == 'a') {
        		s[writeIdx--] = 'd';
        		s[writeIdx--] = 'd';
        	} else {
        		s[writeIdx--] = s[curIdx];
        	}
        	--curIdx;
        }
        return String.valueOf(s);
    }
    
}