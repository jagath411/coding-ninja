package PriorityQueue;
import java.util.ArrayList;

public class Priority_Queue<T> {
	private ArrayList<Element<T>> heap;
	public Priority_Queue() {
		heap=new ArrayList<>();
	}
	public void insert(T value,int priority) {

	}
	public T getMin() throws priorityQueueException {
		if(isEmpty()) {
			throw new priorityQueueException();
		}
		return heap.get(0).value;
	}
	public T removeMin() {

	}
   public int size() {
	   return heap.size();
   }
   public boolean isEmpty() {
	   if(size()==0) {
		   return true;
	   }
	   return false;
   }
}
