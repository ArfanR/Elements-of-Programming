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
}