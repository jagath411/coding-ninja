package strings;
import java.util.Scanner;
public class inputprintString {
	public static void printChar(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
        String str=s.nextLine();
        printChar(str);
	}

}
