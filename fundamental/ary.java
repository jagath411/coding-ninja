package fundamental;
import java.util.Scanner;
public class ary {

	public static  main(String[] args) {
	Scanner s = new Scanner (System.in);
	int n=s.nextInt();
	int[] arr=new int[n];
	for(int i=0,j=89;i<n;i++,j++)
	{
		//System.out.println("enter the elem in arr"+i+"index");
		 arr[i]=j;
		}
	System.out.println(arr[6]);
	}

}
