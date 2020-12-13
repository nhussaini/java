
public class StringManipulation {

	public static void main(String[] args) {
		String str = "the rains have started here";
		String str1 = "the rains Have started here";
		
		System.out.println("length of the string is: "+str.length());//gives the length of the string
		System.out.println("Character at 5th index is: "+ str.charAt(5));
		System.out.println("index of s is: "+ str.indexOf('s'));//first occurrence of s
		System.out.println("index of second s is: "+str.indexOf('s',str.indexOf('s')+1));//second occurrence of s
		System.out.println("index of have is: "+str.indexOf("have"));
		System.out.println("index of hello is: "+ str.indexOf("hello"));//returns -1
		
		//String comparison:
		System.out.println("Are these strings equal: "+str.equals(str1));
		System.out.println("Are these strings equal: "+str.equalsIgnoreCase(str1));
		
		//substring
		System.out.println(str.substring(0, 8)); //extracts a substring; it doesn't include the 8th char though

		//trim:
		String s="   Hello World  ";
		System.out.println(s.trim());//trim method only removes the before space and after space, not the between space
		System.out.println(s.replace(" ", ""));//it removes all kind of space
		String date="01-01-2020";
		
		System.out.println(date.replace("-", "/"));
		
		//split:
		String test = "Hello_World_Test_Selenium";
		String testVal[] = test.split("_");//split method returns a string array
		for(String i: testVal) {
			System.out.print(i+" ");
		}
		System.out.println();
		//Concatenation
		String s2="care";
		System.out.println(s2.concat("s"));
		
		
		String x = "Hello";
		String y = "World";
		int a = 100;
		int b = 200;
		System.out.println(x+y);
		System.out.println(a+b);
		System.out.println(x+y+a+b); //HelloWorld100200
		System.out.println(a+b+x+y);//300HelloWorld
		
		
		
	}

}
