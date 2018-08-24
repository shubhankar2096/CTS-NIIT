import java.util.Scanner;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,reversed=0;
		//int a[]=new int[20];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		m=s.nextInt();
		while(m!=0)
		{
			//n is digit
			n=m%10;//1234->4
			reversed=(reversed*10)+n;//if we mod any number by 10, we will get a digit at unit place e.g. (0*10)+4=4;(4*10)+3=43 and so on
			m=m/10;//if we divide any number by 10,we can eliminate or remove digit at unit place 1234->123
			
			
		}
		System.out.println("Reversed is:"+reversed);
		
		s.close();
	}

}
