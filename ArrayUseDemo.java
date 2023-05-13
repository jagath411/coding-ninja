package DataStructure;
import java.util.ArrayList;
public class ArrayUseDemo {

	public static void main(String[] args) {
        
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(1,80);
		
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		//Enhanced for loop -for each loop
		for(int i:arr) {
			System.out.println(i);
		}
		
	}

}
