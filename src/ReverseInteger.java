
public class ReverseInteger {

	public static void main(String[] args) {
		// 1. Using algorithm:
		int num = 12345;
		int rev = 0;
		
		while(num != 0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		
		System.out.println("The reverse number is: "+rev);
		
		//2. using StringBuffer method:
		int num1=12345;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		

	}

}
