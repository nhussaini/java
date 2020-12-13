import java.util.Scanner;

public class VowelAndConsonant {

	public static void main(String[] args) {
		// a e i o u
		
		System.out.println("input a character: ");
		Scanner input = new Scanner(System.in);
		char c = input.next().charAt(0);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println(c+" is vowel");
		}else {
			System.out.println(c+" is consonant");
		}

	}

}
