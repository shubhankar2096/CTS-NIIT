import java.util.*;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,sum=0;
		//int a[]=new int[20];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		m=s.nextInt();
		while(m>0)
		{
			n=m%10;
			//if we mod any number by 10, we will get a digit at unit place
			sum=sum+n;
			m=m/10;
			//if we divide any number by 10,we can eliminate or remove digit at unit place
			
		}
		System.out.println("Sum is:"+sum);
		
		s.close();
	}

}
