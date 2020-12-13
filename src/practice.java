
public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "nasrullah";
		String b = "";
		
		for(int i=a.length()-1; i>=0; i--) {
			b=b+a.charAt(i);
		}
		
		System.out.println("the reverse string is: "+ b);
		
		StringBuffer sb = new StringBuffer(a);
		System.out.println(sb.reverse());
		
		
	}
	

}
