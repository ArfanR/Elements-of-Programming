import java.util.*;

public class ReverseWordsInASentence {

    /*
    6.6
    */

    public static String reverseWordsInASentence(char[] input) {
    	int n = input.length;
    	// First, reverse all characters in sentence
    	reverse(input, 0, n-1);
    	// Second, reverse every word in sentence
    	int start = 0, end = 0;
    	while (start < n) {
    		// skip extra white spaces
    		while (start < end || start < n && input[start] == ' ') {
    			++start;
    		}
    		// skip to the end of the word 
    		while (end < start || end < n && input[end] != ' ') {
    			++end;
    		}
    		reverse(input, start, end-1);
    	}
        return String.valueOf(input);
    }
    

    public static void reverse(char[] array, int start, int end) {
    	while (start < end) {
    		char tmp = array[start];
    		array[start++] = array[end];
    		array[end--] = tmp;
    	}
    }
    
}