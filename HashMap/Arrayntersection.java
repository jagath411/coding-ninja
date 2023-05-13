package HashMap;
import java.util.HashMap;
public class Arrayntersection {

	public static void printIntersection(int arr[],int arr1[]) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				int value=map.get(arr[i]);
				map.put(arr[i],value+1);
			}else {
				map.put(arr[i],1);
			}
		}
			for(int i=0;i<arr1.length;i++) {
				if(map.containsKey(arr1[i])) {
					int freq=map.get(arr1[i]);
					if(freq>0) {
						System.out.println(arr1[i]+" ");
						map.put(arr1[i],freq-1);
					}
				}
			}
		}

	
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,3,4,5,6,7};
		int[] arr1= {1,3,4,7,85,4,35};
		printIntersection(arr,arr1);
			
			}

}
