import java.util.Scanner;
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,num,flag;
		System.out.println("Prime numbers are:");
		for(num=0;num<=100;num++)
		{
			flag=0;
			if(num<=1)
			{
				//System.out.println(num+" is not prime");
				continue;
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
				//System.out.println(num+" is not prime");
				continue;
			}
		}

	}

}
