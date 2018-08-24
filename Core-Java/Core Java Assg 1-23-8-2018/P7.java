import java.util.*;
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,avg=0;
		int a[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 10 numbers:");
		for(i=0;i<10;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<10;i++)
		{
			avg+=a[i];
		}
		avg=avg/10;
		System.out.println("Average of 10 numbers is:"+avg);
		s.close();
			

	}

}
