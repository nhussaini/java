//https://www.codevscolor.com/java-program-count-occurrence-each-character-string
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountEachCharacter {

	public static void main(String[] args) {
		
		String inputString;
		System.out.println("Enter a string: ");
		Scanner input=new Scanner(System.in);
		int count;
		inputString=input.nextLine();
		System.out.println("You entered: "+inputString);
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char character: inputString.toCharArray()) {
			if(map.containsKey(character)) {
				count = map.get(character);
				map.put(character, count+1);
			}else {
				map.put(character, 1);
				
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
		
		
		
		

	}

}
