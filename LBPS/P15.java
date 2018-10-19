class Rep
{
	void rep(int[] ip)
	{
		int i,j;
		for(i=0;i<ip.length;i++)
		{
			for(j=i+1;j<ip.length;j++)
			{
				if(ip[i]<ip[j])
				{
					ip[i]=ip[j];
					break;
				}
			}
		}
		System.out.println("Array after replacement is:");
		for(i=0;i<ip.length;i++)
		{
			System.out.print("\t"+ip[i]);
		}
	}
}
public class P15 {

	public static void main(String[] args) {
		Rep r=new Rep();
		int[] ip= {1,3,4,2,1,10,7,8,4,3};
		r.rep(ip);
	}

}
