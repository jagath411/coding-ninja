package fundamental;
import java.util.Scanner;
public class pattern5 {

	public static void main(String[] args) {
		/* Online Java Compiler and Editor */
		Scanner s  = new Scanner(System.in);
		int  n = s.nextInt();
		int i=1;
		while(i<=n)
		{
			char p =(char)('A'+n-i);
			int j=1;
			while(j<=i)
			{

				System.out.print(p);
				p=(char)(p+1);
				j=j+1;
				
			}
			System.out.println();
			i=i+1;
			
		}
		}


}
