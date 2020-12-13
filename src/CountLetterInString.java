//count letters in a string
public class CountLetterInString {
	
	public static void main(String args[]) {
		
		String a= "ab34cfrg";
		int count=0;
		System.out.println("String is: "+ a);
		
		for (int i=0; i<a.length(); i++) {
			if(Character.isLetter(a.charAt(i))) {
				count++;
			}
		}
		System.out.println(count);
	}

}
