package Binaryclass;
import java.util.Scanner;
public class BinaryTreeUse {
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter left child of "+parentData);
		}else {
			if(isLeft) {
				System.out.println("Enter right child of "+parentData);
			}
		}
		Scanner s=new Scanner(System.in);
		int rootData=s.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
	//	BinaryTreeNode<Integer> leftChild=takeTreeInputBetter();
	//	BinaryTreeNode<Integer> rightChild=takeTreeInputBetter();
	  //  root.left=leftChild;
	 //   root.right=rightChild;
	    return root; 
	
	}
	public static int largest(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return -1;
		}
		int largestleft=largest(root.left);
		int largestright=largest(root.right); 
		return Math.max(root.data,Math.max(largestleft,largestright));
	}
	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null ) {
			return 1;
		}
		return numLeaves(root.left)+numLeaves(root.right);
	}
	public static void printTreeDetail(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+":");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+",");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		printTreeDetail(root.left);
		printTreeDetail(root.right);
	}
	public static void printAtdepth(BinaryTreeNode<Integer>root,int k) {
		if(root==null) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		printAtdepth(root.left,k-1);
		printAtdepth(root.right,k-1); 
	}
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner s=new Scanner(System.in);
		int rootdata =s.nextInt();
		if(rootdata ==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer> (rootdata);
		Queue<> pendingChildren =new LinkedList<E>
	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftheight = height(root.left);
		int rightheight = height(root.right);
		return 1+Math.max(leftheight, rightheight);
	}
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return true;
		}
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		if(Math.abs(rightHeight-leftHeight)>1) {
			return false;
		}
		boolean isleftbalanced=isBalanced(root.left);
		boolean isrightbalanced=isBalanced(root.right);
		 
		return isleftbalanced && isrightbalanced;
	}
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}
//	public static BinaryTreeNode<Integer> takeTreeInput(){
//		System.out.println("Enter root data");
//		Scanner s=new Scanner(System.in);
//		int rootData=s.nextInt();
//		if(rootData==-1) {
//			return null;
//		}
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
//	    BinaryTreeNode<Integer> leftchild= takeTreeInput();
//	    BinaryTreeNode<Integer> rightchild= takeTreeInput();
//	    root.left=leftchild;
//	    root.right=rightchild;
//	    return root;
//	}
	public static void main(String[] args){
//	 BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//
//     BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//     BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//     root.left = rootLeft;
//     root.right =rootRight;
////      printTreeDetail(root);
//// 
//     BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
//     BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
//
//     rootLeft.right = twoRight;
//     rootRight.left = threeLeft; 
		BinaryTreeNode<Integer> root = takeTreeInput();
		printTreeDetail(root);
	}
}
