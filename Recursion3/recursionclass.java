package Recursion3;

import java.util.Scanner;

public class recursionclass {
public static String[] Subsequences(String input) {
	if(input.length()==0) {
		String[] output =new String[1];
	     output[0]="";
	     return output;
}
	String[] smalloutput=Subsequences(input.substring(1));
	String[] output =new String[smalloutput.length*2];
	for(int i=0;i<smalloutput.length;i++) {
		output[i]=smalloutput[i];
	}
	for(int i=0;i<smalloutput.length;i++) {
		output[smalloutput.length+i]=input.charAt(0)+smalloutput[i];
	}
	return output;
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("ENTER String");
	String input=s.next();
	String[] output=Subsequences(input);
	for(String outputString:output) {
		System.out.println(outputString);
	}
	}
}
