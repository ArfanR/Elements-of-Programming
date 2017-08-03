import java.util.List;

public class AdvanceThroughArray {

    /*
       5.4
    */
	
	public static boolean arrayAdvance(List<Integer> A) {
		int furthestAdvance = 0, lastIndex = A.size()-1;
		for (int i = 0; i <= furthestAdvance && furthestAdvance < lastIndex; i++) {
			furthestAdvance = Math.max(furthestAdvance, A.get(i) + i);
		}
		return furthestAdvance >= lastIndex;
	}
	
	// Variant: min number of steps to get to last location
	public static int arrayAdvance2(List<Integer> A) {
		int minSteps = 0, furthestAdvance = 0, lastIndex = A.size()-1;
		for (int i = 0; i <= furthestAdvance && furthestAdvance < lastIndex; i++) {
			if (A.get(i)+i > furthestAdvance) {
				minSteps++;
				furthestAdvance = A.get(i)+i;
			}
		}
		return minSteps;
	}
	
	// Solution will not work for large entries with large possibilities 
    public static boolean arrayAdvance3(List<Integer> A) {
    	int prevPos = 0, currPos = 0;
    	int prevVal = A.get(0), currVal = A.get(0);
    		
   		if (A.size() <= 1) {
   			return true;
   		}	
   		while (currPos < A.size()-1) {    			
   			if  (A.get(currPos + currVal) == 0) {
    			currVal--;
    			if (currVal == 0 ) {
   					if (prevVal-1 == 0) {
   						return false;
   					}
   					else {
   						currPos = prevPos;
    					currVal = prevVal -1;
    				}	
    			}
    		}
    		else if (A.get(currPos + currVal) > 0) {
    			prevPos = currPos;
    			prevVal = currVal;
    			currPos = currPos + currVal;
    			currVal = A.get(currPos);
    		}
    	}
        return true;
    }
    
}