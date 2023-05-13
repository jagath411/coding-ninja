package recursion;

public class removex {
	
		 public static String replaceChar(String input,char x){
		        if(input.length()==0){
		            return input;
		        }
		        String smallOutput=replaceChar(input.substring(1),x);
		        if(input.charAt(0)==x){
		            return smallOutput;
		        }else{
		            return input.charAt(0)+smallOutput;
		        }
		    }
		    public static void main(String[] args){
		        System.out.println(replaceChar("abcxdxex",'x'));
	}

}
