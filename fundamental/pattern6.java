package fundamental;
import java.util.Scanner;
public class pattern6 
{

	public static void main(String[] args) 
	{
		Scanner s  = new Scanner(System.in);
		int  n = s.nextInt();
		int i=1;
		while(i<=n)
		{
				int v=1;
				while(v<=n-i)
				{
					System.out.print(' ');
					v=v+1;
				}
				int j=1;
				while(j<=i)
				{
					System.out.print('*');
					j=j+1;
				}
					int d=i-1;
			        while(d>=1)
			        {
			        	System.out.print('*');
			        	d=d-1;
			        }
				
                    System.out.println();
				i=i+1;

			}
		}
	}

