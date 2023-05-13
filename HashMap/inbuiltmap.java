package HashMap;
import java.util.HashMap;
public class inbuiltmap{
	
	
	public static void main (String[] args) {
		HashMap<String,Integer> map=new HashMap<>();
		map.put("abc",1);
		map.put("def",3);
		//presence
		if(map.containsKey("abc"));
		{
			System.out.println("map has abc");
		}
		if(map.containsKey("def")) {
			System.out.println("map has def");
		}
		//get value
		int v=map.get("abc");
		System.out.println(v);
		int v1=0;
		if(map.containsKey("abc1")) {
			v1=map.get("abc1");
		}
		System.out.println(v1);
		set<String> keys=map.keyser();
		for(String s:keys) {
			System.out.println(s);
		}
	}
	
}