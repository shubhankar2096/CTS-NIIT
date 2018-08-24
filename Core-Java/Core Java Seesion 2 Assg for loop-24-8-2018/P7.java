import java.util.*;
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j=0,range,num;
		int f[]=new int[100];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter range:");
		range=s.nextInt();
		f[0]=0;
		f[1]=1;
		if(range<=1)
		{
			System.out.println(range);
		}
		System.out.print("\t"+f[0]);
		System.out.print("\t"+f[1]);
		for(i=2;i<range;i++)
		{
			j=f[i-1]+f[i-2];
			f[i]=j;
			System.out.print("\t"+j);
		}
	}

}
