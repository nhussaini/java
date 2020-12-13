//Remove junk/spcial characters in String 
//With the help of replace() function in Java, you can replace characters in your string.

//Java String replace() method replaces every occurrence of a given character with a new character
//and returns a new string. The Java replace() string method allows the replacement of a sequence
//of character values.
//public Str replace(char oldC, char newC)

//Java String replaceAll() method finds all occurrences of sequence of characters matching a
//regular expression and replaces them with the replacement string.
//At the end of call, a new string is returned by the function replaceAll() in Java.


public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="%$# trying to remove the junk or unwanted chars";
		
		//Regular expression: [^a-zA-Z0-9]
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);

	}

}
