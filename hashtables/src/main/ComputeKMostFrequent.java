import java.util.*;

public class ComputeKMostFrequent {

    /*
    12.5
    */

    public static List<String> mostFrequent(List<String> list, int k) {
    	Map<String, Integer> count = new HashMap<>();
    	for (int i = 0; i < list.size(); i++) {
    		if (count.containsKey(list.get(i))) {
    			count.put(count.get(i), count.get(i) + 1);
    		}
    		else {
    			count.put(count.get(i), 1);
    		}
    	}
    	List<String> candidates = new ArrayList(count.keySet());
    	Collections.sort(candidates, (w1, w2) -> count.get(w1).equals(count.get(w2)) ? 
    			w1.compareTo(w2) : count.get(w2) - count.get(w1));
    	return candidates.subList(0, k);
    }
}