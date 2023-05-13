package array2d;

import java.util.Scanner;

public class functionwith2darray {
	public static void printarray(int[][] arr) {
		int row=arr.length;
		int cols =arr[0].length;
		for(int i=0;i<row;i++) {
	    	 for(int j=0;j<cols;j++) {
	    		 System.out.print(arr[i][j]+" ");
	    		 
	    	 }
	    	 System.out.println();
	     }
	}
     public static int[][] takeinput() {
    		Scanner s=new Scanner(System.in);
   	     System.out.println("Enter number of rows");
   	     int row = s.nextInt();
   	     System.out.println("Enter number of column");
   	     int cols = s.nextInt();
   	     int[][] arr=new int[row][cols];
   	    
   	     for(int i=0;i<row;i++) {
   	    	 for(int j=0;j<cols;j++) {
   	    		 System.out.println("Enter the element"+i+"row"+j+"cols");
   	    		 arr[i][j]=s.nextInt();
   	    	         }}return arr;
     }
     
	public static void main(String[] args) {
		
	   int[][] input=takeinput();
	   printarray(input);
	   
	     
	}
}
