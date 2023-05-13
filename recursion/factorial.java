package recursion;

public class factorial {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int smalloutput=fact(n-1);
		int output=n*smalloutput;
		return output;
	}
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		int small=sum(n-1);
		int output=n+small;
		return output;
	}
	public static int power(int x,int n)
	{
		
		if(n==0) {
			return 1;
		}
		int small=power(x,n-1);
		return x*small;
	}
	public static void printnum(int n) {
		if(n==0) {
			return;
			}
			printnum(n-1);
			System.out.println(n);
		}
	public static boolean isort(int a[]) {
	      if(a.length==1){
	            return true;
	        }
	        if(a[0]>a[1]){
	            return false;
	        }
	        int smallArray[]=new int[a.length-1];
	        for(int i=1;i<a.length;i++){
	            smallArray[i-1]=a[i];
	        }
	        boolean isSmallArraySorted=isort(smallArray);
	        return isSmallArraySorted;
	}
	public static int sum(int input[]) {
		return sum(input,0);
		
	}
    private static int sum(int input[],int startIndex){
        if(startIndex==input.length) {
            return 0;
            }
        int ans=input[startIndex]+sum(input,startIndex+1);
        return ans;
    }
    public static boolean isSortedBetter(int a[],int si){
        if(si==a.length-1){
            return true;
        }
        if(a[si]>a[si+1]){
            return false;
        }
        boolean isSmallArraySorted=isSortedBetter(a,si+1);
        return isSmallArraySorted;
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//             System.out.println(fact(5));
//             System.out.println(sum(4));
    //         System.out.println(power(3,3));
	//printnum(5);
	int[] arr= {7,2,3,4,5};
	//System.out.println(isort(arr));
	//System.out.print(sum(arr));
	System.out.println(isSortedBetter(arr,0));
	}

}
