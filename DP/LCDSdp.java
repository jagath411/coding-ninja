package DP;

public class LCDSdp {
     public static int lcs(String str1,String str2,int i,int j) {
    	if()
    	 int myans;
    	 if(str1.charAt(i)==str2.charAt(j)) {
    		int smallans=lcs(str1,str2,i+1,j+1);
    		myans=1+smallans;
    	 }
    	 else {
    		 int ans1=lcs(str1,str2,i+1,j);
    		 int ans2=lcs(str1,str2,i,j+1);
    		 myans=Math.max(ans1,ans2);
    		 
    	 }
     }
	public static void main(String[] args) {
		String str1="bedgmc";
		String str2="abdfglc";
		
		int ans=lcs(str1,str2,0,0);
		System.out.println(ans);

	}

}
