import java.util.*;
public class P9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j,prod=1,avg=0;
		int a[]=new int[100];
		char ans;
		Scanner s=new Scanner(System.in);
		do
		{
			System.err.println("Enter number:");
			a[i]=s.nextInt();
			i++;
			System.out.println("Wanna continue?");
			ans=s.next().charAt(0);
		}
		while(ans!='q');
		for(j=0;j<i;j++)
		{
			prod=prod*a[j];
		}
		for(j=0;j<i;j++)
		{
			avg=avg+a[j];
		}
		avg=avg/i;
		System.out.println("Product is:"+prod);
		System.out.println("Average is:"+avg);
		s.close();

	}

}
