import java.util.*;
public class Max_Min_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[],min=1,max=0;
		Scanner s=new Scanner(System.in);
		a=new int[10];
		System.out.println("Enter array elements:");
		for(int i=0;i<10;i++)
		{
			a[i]=s.nextInt();
			if(a[i]<min)
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Maximum number is:"+max);
		System.out.println("Minimum number is:"+min);
	}

}
