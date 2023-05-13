package Stacks;

public class StackUsingArray {
     
	private int data[];
	private int topIndex;
	public StackUsingArray() {
		data =new int[10];
		topIndex=-1;
	}
	public void push(int elem) {
if(topIndex == data.length  -1) {
	StackFullException e =new StackFullException();
}
data[++topIndex]=elem;
}
	public int size() {
		return topIndex +1;
		}
	public int  top() {
		
	}
	public int  pop() {
		
	}
	public  boolean isEmpty() {
			
	}
}
