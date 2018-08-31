import java.util.*;
public class Second_Highest_Array_P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,max=0;
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements:");
		for(i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		int max2=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]<max && a[i]>max2)
			{
				max2=a[i];
			}
		}
		System.out.println("Second highest number is:"+max2);
	}

}
