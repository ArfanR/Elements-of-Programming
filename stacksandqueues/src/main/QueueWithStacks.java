import java.util.*;

public class QueueWithStacks {

    /*
    8.9
    */

	private Deque<Integer> enqueue = new ArrayDeque<>();
	private Deque<Integer> dequeue = new ArrayDeque<>();
	
    public QueueWithStacks() {
    }

    public void enqueue(Integer x) {
    	enqueue.addFirst(x);
    }

    public Integer dequeue() {
    	if (dequeue.isEmpty()) {
    		while (!enqueue.isEmpty()) {
    			dequeue.addFirst(enqueue.removeFirst());
    		}
    	}
    	if (!dequeue.isEmpty()) {
    		return dequeue.removeFirst();
    	}
    	throw new NoSuchElementException("Cannot pop empty queue");
    }
}