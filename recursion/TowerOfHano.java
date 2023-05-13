package recursion;

public class TowerOfHano {

	 public static void towerHanoi(int n,char s,char h,char d){
	        if(n==1){
	            System.out.println("move 1st disk from "+s+" to "+d);
	            return;
	        }
	        towerHanoi(n-1,s,d,h);
	        System.out.println("move "+ n+"th disk from "+s+" to "+d);
	        towerHanoi(n-1,h,s,d);
	    }
	    public static void main(String[] args){
	        towerHanoi(2,'s','h','d');
	        //System.out.println(replaceChar("abcxdxex",'x','y'));
	        //System.out.println(replacePi("apiapipipiip"));
	        //int[] a={1,3,4,5,6,8};
	        //System.out.println(binarySearch(a,0,a.length-1,100));
	        //int a[]={10,4,5,9,8,6,12,11,7};
	        //quickSort(a,0,a.length-1);
	        //for(int i=0;i<a.length;i++){
	          //  System.out.println(a[i]);
	        //}
	    }

}
