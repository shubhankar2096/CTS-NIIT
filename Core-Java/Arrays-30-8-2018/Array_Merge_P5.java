import java.util.*;
public class Array_Merge_P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j;
		int a1[]=new int[5];
		int a2[]=new int[5];
		int a3[]=new int[10];
		int a4[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array 1 elements:");
		for(int k=0;k<5;k++)
		{
			a1[k]=s.nextInt();
		}
		System.out.println("Enter array 2 elements:");
		for(int k=0;k<5;k++)
		{
			a2[k]=s.nextInt();
		}
		i=0;
		while(i<5)
		{
			a3[i]=a1[i];
			i++;
		}
		j=i;
		int k=0;
		while(k<5)
		{
			a3[j]=a2[k];
			j++;
			k++;
		}
		Arrays.sort(a3);
		/*int temp;
		for(i=0;i<10;i++)
		{
			for(j=i;j<10;j++)
			{
				if(a3[i]>a3[j])
				{
					temp=a3[i];
					a3[i]=a3[j];
					a3[j]=temp;
				}
			}
		}*/
		j=0;
		for(i=0;i<a3.length-1;i++)
		{
			if(a3[i]!=a3[i+1])
			{
				a4[j++]=a3[i];
			}
		}
		a4[j++]=a3[a3.length-1];
		/*for(i=0;i<a3.length;i++)
		{
			for(j=0;j<a3.length-1;j++)
			{
				if(a3[i]==a3[j] && i!=j)
				{
					for(k=j;k<=a3.length;k++)
					{
						a3[k]=a3[k+1];
					}
				}	
			}
		}
		System.out.println("Merged array without duplicate elements is:");
		for (i=0;i<a3.length;i++)
		{
			if(a3[i]==0)
			{
				a3[i]=a3[i+1];
			}
		}*/	
		System.out.println("Merged array without duplicate elements is:");
		for(i=0;i<j;i++)
		{
			System.out.println(a4[i]);
		}
	}

}
