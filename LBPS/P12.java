class Arrange
{
	void arr(int[] ip)
	{
		int i;
		int cnt0=0,cnt1=0;
		for(i=0;i<ip.length;i++)
		{
			if(ip[i]==0)
			{
				cnt0++;
			}
			else
			{
				cnt1++;
			}
		}
		for(i=0;i<cnt0;i++)
		{
			System.out.print("\t0");
		}
		for(i=0;i<cnt1;i++)
		{
			System.out.print("\t1");
		}
	}
}
public class P12 {

	public static void main(String[] args) {
		int input[]= {1,0,0,1,1,0,0,1,1,1};
		Arrange ar=new Arrange();
		ar.arr(input);
	}

}
