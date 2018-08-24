import java.util.*;
import java.math.*;
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double i,sum=0,range,base;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter base:");
		base=s.nextInt();
		System.out.println("Enter range:");
		range=s.nextInt();
		for(i=1;i<=range;i++)
		{
			sum=sum+(Math.pow(base, i));
		}
		System.out.println("Sum of series is:"+sum);
		//System.out.println(2**2);
		s.close();

	}

}
