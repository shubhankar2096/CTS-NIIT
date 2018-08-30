import java.util.*;
public class Array_Dup_P4 {
	public static void main(String args[])
	{
		int i,j,cnt=1;
		int a[]=new int[10];
		int count[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements:");
		for(i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<10;i++)
		{
			count[i]=a[i];
		}
		for(i=0;i<10;i++)
		{
			cnt=1;
			for(j=i+1;j<10;j++)
			{
				if(a[i]==a[j] && i!=j)
				{
					cnt++;
					count[j]=0;
				}
			}
			if(count[i]!=0)
			{
				count[i]=cnt;
			}
		}
		for(i=0;i<10;i++)
		{
			if(count[i]!=0)
			{
				System.out.println(a[i]+"-->"+count[i]);
			}
		}
	}

}
