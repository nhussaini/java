//Print an integer entered by a user
import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=reader.nextInt();
		reader.nextLine();
		
		
		//String
		System.out.println("Enter a name: ");
		String name = reader.nextLine();
		System.out.println("You entered: "+ name);
		System.out.println("You entered: "+num);

	}

}
//Why is reader.nextInt() skipped?
//The problem is with the input.nextInt() method -
//it only reads the int value. So when you continue reading with input.nextLine() you receive the "\n" Enter key.
//So to skip this you have to add the input.nextLine(). Hope this should be clear now.