class Arr1
{
	void arr1(int[] ip)
	{
		int i;
		int cnt=0;
		int res[]=new int[ip.length];
		for(i=0;i<ip.length;i++)
		{
			if(ip[i]<0)
			{
				res[cnt++]=ip[i];
			}
		}
		for(i=0;i<ip.length;i++)
		{
			if(ip[i]>0)
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
public class P13 {

	public static void main(String[] args) {
		Arr1 a1=new Arr1();
		int[] ip= {1,2,-3,2,-9,-8,2,1,-12,10};
		a1.arr1(ip);
	}

}
