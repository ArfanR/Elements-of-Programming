public class CircularQueue {

    /*
    8.8
    */

    private int head = 0, tail = 0, numQueueElements = 0;
    private static final int SCALE_FACTOR = 2;
    private Integer[] entries;

    public CircularQueue(int capacity) {
        this.entries = new Integer[capacity];
    }

    public void enqueue(Integer x) {
    	if (numQueueElements == entries.length) {
    		Collections.rotate(Arrays.asList(entries), -head);
    		head = 0;
    		tail = numQueueElements;
    		entries = Arrays.copyOf(entries, numQueueElements*SCALE_FACTOR);
    	}
    	
    	entries[tail] = x;
    	tail = (tail + 1) % entries.length;
    	++numQueueElements;
    }

    public Integer dequeue() {
    	if (numQueueElements == 0) {
    		throw new NoSuchElementException("Deque called on empty queue");
    	}
    	else {
    		--numQueueElements;
    		Integer ret = entries[head];
    		entries[head] = 0;
    		head = (head + 1) % entries.length;
    		return ret;
    	}
    }

    public int size() {
        return numQueueElements;
    }
}