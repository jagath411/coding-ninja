package fundamental;
import java.util.Scanner;
public class test
{
public static int probability(int n,int x)
	    {
	        double Ns,Ne1,Ne2;
	        int Pe;
	        Ns=(8.0)/(n*1.0)*(8.0-n);
	        Ne1=(4.0)/(x*1.0)*(4.0-x);
	        Ne2=(4.0)/((n-x)*1.0)*(4.0-(n-x));
	        Pe=(int)(((Ne1*Ne2)/Ns)*100);
	        return Pe;
	    }
	    public static void main(String[] args)
	    {
	        Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int x = s.nextInt();
	        int result = probability(n, x);
	        System.out.println(result);
	    }
	}       