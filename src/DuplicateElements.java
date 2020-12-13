import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		
		String names[]= {"Java", "JavaScript","Ruby","C", "Python", "Java"};
		
		//1.compare each element: O(n^2)
		for(int i=0; i<names.length;i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("the duplicate element is: "+ names[i]);
				}
			}
		}
		
		//2.Using HashSet: it stores unique value : O(n)
		Set<String> store = new HashSet<String>();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("The duplicate element is: "+ name);
			}
		}

	}

}
