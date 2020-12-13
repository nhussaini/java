import java.util.HashMap;
import java.util.Map;

//provides basic implementations of Map interface
//stores data in (key, value) pairs
//this class makes no guarantees as to the order of the map
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		
		//add elements
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		System.out.println(map.get("five"));
		
		for(Map.Entry<String, Integer> e : map.entrySet() ) {
			System.out.println("key: "+e.getKey()+" ,value: "+e.getValue());
		}

	}

}
