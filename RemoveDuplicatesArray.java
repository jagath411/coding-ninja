package DataStructure;
import java.util.ArrayList;
public class RemoveDuplicatesArray {

	public static ArrayList<Integer>removeDup(int arr[]){
		ArrayList<Integer>result = new ArrayList<>();
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=arr[i-1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}
	public static void main(String[] args) {
	
		int arr[]= {10,10,20,2020,30,40,10};
         ArrayList<Integer> result =removeDup(arr);
      for(int i=0;i<result.size();i++) {
    	  System.out.println(result.get(i));
      }
	}

}
