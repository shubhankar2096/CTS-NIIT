import java.util.*;
public class P23 {

	public static void main(String[] args) {
		int i;
		int n;
		int f=7;
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to be printed in series:");
		n=sc.nextInt();*/
		i=1;
		while(i<=10)
		{
			System.out.print("\t"+f);
			System.out.print("\t"+(f+3));
			//System.out.print("\t"+(++f));
			f++;
			i+=2;
		}
	}

}
