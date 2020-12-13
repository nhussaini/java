
public class MissingNumInArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,5};
		int sum1=0;
		int sum2=0;
		for(int i=0; i<a.length;i++) {
			sum1 = sum1+a[i];
		}
		System.out.println(sum1);
		
		for(int j=1;j<=5;j++) {
			sum2=sum2+j;
		}
		System.out.println(sum2);
		
		System.out.println("the missing number is: "+(sum2-sum1));
		

	}

}
