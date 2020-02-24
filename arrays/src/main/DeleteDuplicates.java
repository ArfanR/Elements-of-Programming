import java.util.List;

public class DeleteDuplicates {

    /*
    5.5
    */

    public static List<Integer> deleteDuplicates(List<Integer> A) {
    	int counter = 1;
    	// overwrite duplicates with unique values
    	for (int i = 1; i < A.size(); i++) {
    		if (A.get(i) != A.get(counter-1)) {
    			A.set(counter++, A.get(i));
    		}
    	}
    	// add 0s to the remaining values for testing purposes
    	while (counter < A.size()) {
    		A.set(counter++, 0);
    	}
    	return A;
    }
    
    // Variant: remove specific duplicate element 
    public static int deleteDuplicates2(List<Integer> A, int b) {
    	int writeIndex = 0;
    	// overwrite duplicates of the element
    	for (int i = 0; i < A.size(); i++) {
    		if (A.get(i) != b) {
    			A.set(writeIndex++, A.get(i));
    		}
    	}
    	return writeIndex;
    }
    
    // Variant: remove duplicates to appear at most twice
    public static int deleteDuplicates3(List<Integer> A) {
    	if (A.size() < 3) {
	        return A.size();
    	}
    	int counter = 1;
    	// overwrite duplicates with unique values
    	for (int i = 2; i < A.size(); i++) {
    		if (A.get(i) != A.get(counter-1)) {
    			A.set(++counter, A.get(i));
    		}
    	}
    	return counter+1;
    }
    
}