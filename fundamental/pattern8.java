package fundamental;
import java.util.Scanner;
public class pattern8 
{

	public static void main(String[] args) 
	{
		Scanner s  = new Scanner(System.in);
		int  n = s.nextInt();
		int i=1;
		while(i<=n)
		{
				int space=1;
				while(space<=n-i+1)
				{
					System.out.print('*');
					space=space+1;
				}
				int stars=1;
				while(stars<=i)
				{
					System.out.print(' ');
					stars=stars+1;
				}
                    System.out.println();
				i=i+1;

			}
		}
	}

