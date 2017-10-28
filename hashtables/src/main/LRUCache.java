import java.util.*;

public class LRUCache {

    /*
    12.3
    */

	LinkedHashMap<Integer, Integer> isbnToPrice;

	LRUCache(final int capacity) {
		this.isbnToPrice = new LinkedHashMap<Integer, Integer>(capacity, 1.0f, true) {
			@Override
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> e) {
				return this.size() > capacity;
			}
			};
	}
	
	public Integer lookup(Integer key) {
		if (!isbnToPrice.containsKey(key)) {
			return null;
	    }
	    return isbnToPrice.get(key);
	}
	
	public void insert(Integer key, Integer value) {
		isbnToPrice.get(key);
	    if (!isbnToPrice.containsKey(key)) {
	    	isbnToPrice.put(key, value);
	    }
	}
	
	public Boolean erase(Object key) { 
		return isbnToPrice.remove(key) != null; 
	}
	
	
}