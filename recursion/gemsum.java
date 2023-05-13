
package recursion;
import java.text.DecimalFormat;
import java.util.Scanner;
public class gemsum {

	public static double geoSum(int k) {
	if(k==1) {
		return 1;
	}
	double Smallans=geoSum(k-1);
	return Smallans+(1/Math.pow(2,k));
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		System.out.println(geoSum(k));
		}
}
