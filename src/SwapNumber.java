
public class SwapNumber {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
//		System.out.println("before swap:");
//		System.out.println("a: "+a);
//		System.out.println("b: "+b);
//		int temp;
//		temp = a;
//		a=b;
//		b=temp;
//		System.out.println("after swap:");
//		System.out.println("a: "+a);
//		System.out.println("b: "+b);
		
		//without using a temporary variable
		a = a-b; //-10
		b = a+b;//10
		a = b-a;//20
		
		System.out.println("after swap:");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		
		

	}

}
