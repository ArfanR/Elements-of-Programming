import java.util.List;

public class AdvanceThroughArray {

    /*
       5.4
    */
	
	public static boolean arrayAdvance(List<Integer> A) {
		
	}
	
    public static boolean arrayAdvance2(List<Integer> A) {
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