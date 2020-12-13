import java.util.Arrays;

public class SmallestAndLargestNumberInArray {

	public static void main(String[] args) {
		
		int numbers[] = {-10,24,-50,-88, 9876,9877, 0};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for (int i=1; i<numbers.length;i++) {
			if(largest<numbers[i]) {
				largest = numbers[i];
			}else if(smallest> numbers[i]) {
				smallest = numbers[i];
			}
		}
		System.out.println("given array is: "+ Arrays.toString(numbers));
		System.out.println("largest number is: "+ largest);
		System.out.println("smallest number is: "+ smallest);

	}

}
