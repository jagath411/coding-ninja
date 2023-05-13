package fundamental;
import java.util.Scanner;
public class pattern9 {

	public static void main(String[] args) {

		Scanner s  = new Scanner(System.in);
		int  n = s.nextInt();
		int i=1;
int p=i;

		while(i<=n)
		{
			int v=1;
			while(v<=i)
			{
				System.out.print(' ');
				v=v+1;
			}
			int j=1;
			int value = i;
			while(j<=i)
			{

				System.out.print('*');
				j=j+1;
				value=value+1;

			}  
			
			int d=i-1;
			int o=2;
			while(d>=1)
			{
				
				System.out.print(2*i-o);
				o=o+1;
				d=d-1;
				
			}

			System.out.println();
			i=i+1;

		}
	}
}


	