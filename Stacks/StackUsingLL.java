package Stacks;
import LinkedList.Node;
public class StackUsingLL <T>{
	private Node<T> head;
	private int size;
    public int size() {
    	
    }
    public StackUsingLL() {
    	head=null;
    	size=0;
    }
    public  boolean isEmpty() {
    	
    }
    public void push(T elem) {
    	Node<T> newNode =new Node<T>(elem);
    	newNode.next =head;
    	head=newNode;
    	size++;h 5	
    }
    public T top() {
    	
    }
    public T pop() {
    	
    }
}
