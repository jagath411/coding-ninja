package Recursion3;
import java.util.Scanner;
public class Keypad {
	String getOptions
	public static String[] KeypadCombinations(int input) {
		if(input==0) {
			String[] output =new String[1];
			output[0]="";
			return output;
		}
		String[] smalloutput=KeypadCombinations(input/10);
		int lastdigit=input%10;
		String lastdigitoptions=getOptions(lastdigit);
	}


	public static void main(String[] args) {
		
			Scanner s = new Scanner(System.in);
			System.out.println("Enter Number");
			int input = s.nextInt();
			String[] output = KeypadCombinations(input);
			for(String outputString: output) 
			{
				System.out.println(outputString);

	               }
	}
}
