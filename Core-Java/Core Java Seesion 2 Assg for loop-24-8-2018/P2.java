import java.util.*;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,m,n,prod=0,num,digits=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=s.nextInt();
		m=num;
		while(m!=0)
		{
			digits++;
			m=m/10;
		}
		System.err.println(digits);
		m=num;
		while(m!=0)
		{
			n=m%10;
			prod+=(Math.pow(n,digits));
			m=m/10;
		}
		System.out.println(prod);
		if(num==prod)
		{
			System.out.println(num+" is armstrong number");
		}
		else
		{
			System.out.println(num+" is not armstrong number");
		}
		s.close();

	}

}
