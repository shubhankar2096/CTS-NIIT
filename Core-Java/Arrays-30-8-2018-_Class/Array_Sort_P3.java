import java.util.*;
public class Array_Sort_P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		int a[]=new int[10];
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter array elements:");
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<10;i++)
		{
			for (int j=i;j<10;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted array is:");
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
	}

}
