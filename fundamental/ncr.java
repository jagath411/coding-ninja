package fundamental;
import java.util.Scanner;
public class ncr
{
public static int factorial(int num)
{
	int fact=1;
	for(int i=1;i<=num;i++) {
		fact=fact*i;
	}
	return fact;
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	     int n=s.nextInt();
	     int r=s.nextInt();
	     int factN=factorial(n);
	     int factR=factorial(r);
	     int factNR=factorial(n-r);
	     int result=factN/(factR*factNR);
	     System.out.println(result);
	    }
	
	}

