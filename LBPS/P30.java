import java.util.Scanner;
class Sum
{
	void sumDigits(int ip1)
	{
		int i;
		int n,sum=0,k;
		n=ip1;
		while(n>0)
		{
			k=n%10;
			sum+=(k*k);
			n=n/10;
		}
		System.out.println("Sum of square of all digits in "+ip1+" are:"+sum);
	}
}
public class P30 {

	public static void main(String[] args) {
		Sum s=new Sum();
		int ip1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an number:");
		ip1=sc.nextInt();
		s.sumDigits(ip1);
	}

}
