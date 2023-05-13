package fundamental;
import java.util.Scanner;
public class loop1 {

	public static void main(String[] args) {

		int x,n=1,sum,i=1;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		while(n<=x && n<=1000)
		{
			sum=(3*i)+2;
			if(sum%4!=0)
			{
				System.out.print(sum+" ");
				n=n+1;
			}
			i=i+1;
		}
			//		Scanner s = new Scanner(System.in);
//      int sum=0,mul=1;  
//		int n = s.nextInt();
//        int c = s.nextInt();
//		System.out.println(n);
//		System.out.println(c);
//		if(c==1)
//        {
//            while(n<13 && n>0)
//            {
//                sum=sum+n;
//                n--;
//            }
//            System.out.println(sum);
//        }
//      	else if(c==2)
//      	{
//      		while(n>0)
//      		{
//      			mul=mul*n;
//      			n--;
//      		}
//      		 System.out.println(mul);
//      	}
//      	else
//      	{
//      		System.out.println(-1);
//      	}

		}
}		
		
		
		
		
		// TODO Auto-generated method stub
//int n=5;
//for(int i=1;i<=n;i++)
//{
//	for(int j=1;j<=n;j++)
//	{
//		if(i+1==j) {
//			break;
//		}
//		System.out.print(j+" ");
//	}
//
//
//	System.out.println();
//}
	
