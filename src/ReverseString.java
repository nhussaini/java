
public class ReverseString {

	public static void main(String[] args) {
		String s="Selenium";
		
		//string.reverse() function is not available because string is immutable
		//Difference between String and StringBuffer? .reverse()is available in StringBuffer
		//Do we have reverse function in String? no
		
		//using for loop
		int len = s.length();
		String reverse="";
		for(int i=len-1; i>=0; i--) {
		reverse=reverse+s.charAt(i);
	}
		System.out.println(reverse);
		//2. Using string butter class
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());

}
}
