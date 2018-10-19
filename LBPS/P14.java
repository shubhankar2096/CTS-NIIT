class Arr2
{
	void arr2(int[] ip)
	{
		int i;
		int cnt=0;
		int res[]=new int[ip.length];
		for(i=0;i<ip.length;i++)
		{
			if(ip[i]%2==0)
			{
				res[cnt++]=ip[i];
			}
		}
		for(i=0;i<ip.length;i++)
		{
			if(ip[i]%2!=0)
			{
				res[cnt++]=ip[i];
			}
		}
		for(i=0;i<cnt;i++)
		{
			System.out.print("\t"+res[i]);
		}
	}
}
public class P14 {

	public static void main(String[] args) {
		Arr2 a2=new Arr2();
		int[] ip= {12,3,4,7,8,9,2,4,2,4};
		a2.arr2(ip);
	}

}
