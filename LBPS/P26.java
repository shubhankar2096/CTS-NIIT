class Pall
{
	int checkPallindrome(int[] ip1)
	{
		int i,j;
		int n=ip1.length-1;
		for(i=0;i<ip1.length;i++)
		{
				/*System.out.println("Iteration:"+i);
				System.out.println("ip1[i]"+ip1[i]);
				System.out.println("ip1[j]"+ip1[j]);*/
				if(ip1[i]!=ip1[n])
				{
					System.out.println("Array is not pallindrome.");
					return -1;
				}
				n--;
		}
		System.out.println("Array is pallindrome.");
		return 0;
	}
}
public class P26 {

	public static void main(String[] args) {
		int[] ip1= {1,2,3,4,5,0,5,4,3,2,1};
		int[] ip2= {1,2,3,4,5,6,7,8,9,10};
		Pall p=new Pall();
		p.checkPallindrome(ip1);
		p.checkPallindrome(ip2);
	}
}
