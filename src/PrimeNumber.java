//In math, prime numbers are whole numbers greater than 1, that have only two factors – 1 and the number itself.
//Prime numbers are divisible only by the number 1 or itself.  
//For example, 2, 3, 5, 7 and 11 are the first few prime numbers.

public class PrimeNumber {
	
	public static boolean isPrimeNumber(int num) {
		
		//edge cases
		if(num <= 1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("2 is a prime number: "+ isPrimeNumber(2));
		System.out.println("3 is a prime number: "+ isPrimeNumber(3));
		System.out.println("10 is a prime number: "+ isPrimeNumber(10));
		System.out.println("17 is a prime number: "+ isPrimeNumber(17));
		System.out.println("0 is a prime number: "+ isPrimeNumber(0));
		System.out.println("-3 is a prime number: "+ isPrimeNumber(-3));

	}

}
