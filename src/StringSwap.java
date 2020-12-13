
public class StringSwap {

	public static void main(String[] args) {
		
		//WAP to swap strings without using temp/third variable
		
		String a = "Hello";
		String b = "World";
		
		System.out.println("before swap: ");
		System.out.println("the value of String a: "+ a);
		System.out.println("the value of String b: "+ b);
		
		//append a and b
		a=a+b;
		 
		 //2.store initial string a in string b
		b=a.substring(0,a.length()-b.length());
		 
		 
		 //3.store initial string b in string a
		a=a.substring(b.length());
		 
		 
		 System.out.println("after swap: ");
			System.out.println("the value of String a: "+ a);
			System.out.println("the value of String b: "+ b);
		

	}

}
