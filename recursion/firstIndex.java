package recursion;

public class firstIndex {

	public static int FirstIndex(int input[], int x ) {
		if(input.length<=1){
	          if(input[0]==x){
	            return 0;
	          }else{
	            return -1;
	          }
	        }
	      	int smallArray[]=new int[input.length-1];
	      	for(int i=0;i<input.length-1;i++){
	          smallArray[i]=input[i];
	        }
	      	int val=FirstIndex(smallArray,x);
	     	if(val==-1){
	          if(input[input.length-1]==x){
	            return input.length-1;
	          }
	        }
	        return val;  

	}
public static void main(String[] args) {
	int[] input= {1,2,3,4,5,6,7,89,9,9,0,90};
	System.out.println(FirstIndex(input,90));
			}
}
