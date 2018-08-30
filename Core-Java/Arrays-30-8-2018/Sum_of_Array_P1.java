import java.util.*;
public class Sum_of_Array_P1 {

	public static void main(String[] args) {
		int a[],sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size:");
		int n=s.nextInt();
		a=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
			sum+=a[i];
		}
		System.out.println("Sum is:"+sum);
	}

}
