import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		//creating HashSet and adding elements
		HashSet<String> hs =new HashSet<>();
		
		hs.add("geeks");
		hs.add("for geeks");
		hs.add("is");
		hs.add("helpful");
		
		//Traversing element
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
