import java.util.*;
public class Array_Search_P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,flag=0,key;
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for(i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter element to be searched:");
		key=s.nextInt();
		for(i=0;i<10;i++)
		{
			if(key==a[i])
			{
				System.out.println("Element found at:"+i);
				flag=1;
			}
		}
		if(flag==0)
		{
			System.out.println("Element not found");
		}
		s.close();
	}

}
