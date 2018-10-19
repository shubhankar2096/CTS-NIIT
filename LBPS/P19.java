import java.util.Scanner;
import java.util.Arrays;

class Big
{
	int bigDiff(int[] ip)
	{
		Arrays.sort(ip);
		return ip[ip.length-1]-ip[0];
	}
}
public class P19 {

	public static void main(String[] args) {
		int i;
		int n,ip[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array which must be greater than 2:");
		n=sc.nextInt();
		if(n>2)
		{
			ip=new int[n];
			System.out.println("Enter array elements:");
			for(i=0;i<n;i++)
			{
				ip[i]=sc.nextInt();
			}
			Big b=new Big();
			int resdiff=b.bigDiff(ip);
			System.out.println("Biggest difference is:"+resdiff);
		}
	}

}
