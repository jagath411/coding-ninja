package DP;

public class MinSteptoOne {
	public static int minSquaresI(int n) {
		int[] dp=new int[n+1];
		dp[0] =0;
		for(int i=1;i<=n;i++) {
			int minAns =Integer.MAX_VALUE;
			for(int j=1;j*j<=i;j++) {
				int currAns=dp[i-(j*j)];
				if(minAns>currAns) {
					minAns=currAns;
				}
			}
			dp[i]=1+minAns;
		
		}return dp[n];
	}
          public static int MinStepto1(int n,int[] dp) {
        	  if(n==1) {
        	  return 0;
          }
          int ans1;
          if(dp[n-1]==-1) {
        	 ans1=MinStepto1(n-1,dp);
        	 dp[n-1]=ans1;
          }else {
        	  ans1=dp[n-1];
          }
          int ans2=Integer.MAX_VALUE;
        	   if(n%2==0) {
        		   if(dp[n/2]==-1) {
        			   ans2=MinStepto1(n/2,dp);
        			   dp[n/2]=ans2;
        		   }else {
        			   ans2=dp[n/2];
        		   }
        	   }
        int ans3=Integer.MAX_VALUE;
        if(n%3==0) {
        	if(dp[n/3]==-1) {
        		ans3=MinStepto1(n/3,dp);
        		dp[n/3]=ans3;
        	}else {
        		ans3=dp[n/3];
        	}
        }
        int myAns=Math.min(ans1, Math.min(ans2, ans3))+1;
        return myAns;
 }
	public static void main(String[] args) {
		
          int n=10;
          int[] dp=new int [n+1];
          for(int i=0;i<dp.length;i++) {
        	  dp[i]=-1;
          }
          int ans=MinStepto1(n,dp);
          System.out.println(ans);
	}

}
