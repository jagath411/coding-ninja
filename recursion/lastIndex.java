package recursion;

public class lastIndex {

	public static int lastIndex(int input[],int x) {
		
		return lastIndex(input,x,input.length-1);
    }
    private static int lastIndex(int input[],int x,int startIndex){
        if(startIndex<0)
            return -1;
        if(input[startIndex]==x)
            return startIndex;
        return lastIndex(input,x,startIndex-1);
        }
public static void main(String[] args) {
		int[] input= {2,4,5,6,7,8,9};
		System.out.println(lastIndex(input,2));
}
}
