import java.util.*;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,num,flag=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		num=s.nextInt();
		s.close();
		if(num<=1)
		{
			System.out.println(num+" is not prime");
		}
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println(num+" is prime");
		}
		else
		{
			System.out.println(num+" is not prime");
		}

	}

}
