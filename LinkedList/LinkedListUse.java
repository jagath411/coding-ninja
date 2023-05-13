package LinkedList;
import java.util.Scanner;
class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;
	DoubleNode(){
		
	}
	DoubleNode(Node<Integer> head,Node<Integer> tail){
		this.head=head;
		this.tail=tail;
	}
}
public class LinkedListUse {
	  public static Node<Integer> createLinkedList(){
	    Node<Integer> n1= new Node<>(10);
	    Node<Integer> n2= new Node<>(20);
	    Node<Integer> n3= new Node<>(30);
	    Node<Integer> n4= new Node<>(40);
	    n1.next=n2;
	    n2.next=n3;
	    n3.next=n4;
	    return n1;
	    }
	  public static void print(Node<Integer> head) {
		//  System.out.println("Print  "+head);
		  Node<Integer> temp = head;
		  while(temp!=null) {
			  System.out.println(temp.data);
			  temp=temp.next; 
		  }
		  System.out.println();
		  
	  } 
	  public static  Node<Integer> takeInput(){
		  Scanner s=new Scanner(System.in);
		  int data =s.nextInt();
		  Node<Integer> head = null,tail=null;
	        while(data != -1){
	          Node<Integer> currentNode= new Node<Integer>(data);
	          if(head==null){
	            head=currentNode;
	          }else{
	        	  tail.next=currentNode;
	        	  tail=currentNode;
//	            Node<Integer> tail = head;
//	            while(tail.next!=null){
//	                tail= tail.next;
//	            }
//	            tail.next= currentNode;
	          }
	          data=s.nextInt();
	  }
	     return head;
	  }


	  public static void printR(Node<Integer> head) {
		  if(head == null) {
			  return;
		  }
		  System.out.println(head.data+" ");
		  printR(head.next);
	  }
	  public static Node<Integer> insertR(Node<Integer> head,int elem,int pos){
		  if(head==null) {
			  return head;
		  }
		  if(pos==0) {
			  Node<Integer> newNode=new Node<>(elem);
			  newNode=head;
			  return newNode;
		  }else {
			  head.next = insertR(head.next,elem,pos-1);
			  return head;
		  }
	  }
	  public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
	    	if (head == null)
	            return head;
	        if (pos == 0)
	            return head.next;
	        head.next = deleteNodeRec(head.next, pos - 1);
	        return head;
	  }
//	  public static DoubleNode reverseRBetter(Node<Integer> head) {
//		  DoubleNode ans;
//		  if(head==null&&head.next==null) {
//			  ans=new DoubleNode();
//			  ans.head=head;
//			  ans.tail=head;
//		  }
//	  }
	public static void main(String[] args) {		
//	 Node<Integer> head = createLinkedList();
       Node<Integer> head=takeInput();
       head=insertR(head,20,0);
       //head=deleteNodeRec(head,4);
//	   print(head);
	}

}
