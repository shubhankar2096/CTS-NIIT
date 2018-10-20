import java.util.Scanner;
class Pall2
{
	void addPall(int ip1,int ip2)
	{
		int i;
		int n=0,sum=0,rev=0,k;
		for(i=ip1;i<=ip2;i++)
		{
			n=i;
			//System.out.println("n:"+n);
			while(n>0)
			{
				k=n%10;
				rev=(rev*10)+k;
				n=n/10;
			}
			//System.out.println("Reverse is:"+rev);
			if(i==rev)
			{
				sum+=i;
			}
			rev=0;
		}
		System.out.println("Sum of all pallindrome numbers between "+ip1+" and "+ip2+" is:"+sum);
	}
}
public class P31 {

	public static void main(String[] args) {
		Pall2 p2=new Pall2();
		int ip1,ip2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 input ranges:");
		ip1=sc.nextInt();
		ip2=sc.nextInt();
		p2.addPall(ip1,ip2);
	}

}
