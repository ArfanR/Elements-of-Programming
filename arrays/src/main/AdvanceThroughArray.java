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
    
}