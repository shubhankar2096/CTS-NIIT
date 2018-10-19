import java.util.Scanner;
class Big1
{
	void findLeaders(int[] ip,int n)
	{
		int i,j,flag=1;
		for(i=0;i<n;i++)
		{
			l1:for(j=i+1;j<n;j++)
			{
				/*if(ip[i]>ip[j])
				{
					continue;
				}*/
				if(ip[i]<ip[j])
				{
					flag=0;
					break l1;
				}
			}
			//System.out.println("Flag:"+flag);
			if(flag==1)
			{
				System.out.println(ip[i]);
			}
			flag=1;
		}
	}
}
public class P20 {

	public static void main(String[] args) {
		int i;
		int n,ip[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array:");
		n=sc.nextInt();
		ip=new int[n];
		System.out.println("Enter array elements:");
		for(i=0;i<n;i++)
		{
			ip[i]=sc.nextInt();
		}
		Big1 b1=new Big1();
		System.out.println("Leaders in array are:");
		b1.findLeaders(ip,n);
	}

}
