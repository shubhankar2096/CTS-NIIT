import java.util.Scanner;
public class P22 {

	public static void main(String[] args) {
		int i;
		int n;
		int f=6;
		int s=20;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements to be printed in series:");
		n=sc.nextInt();
		i=1;
		while(i<=n)
		{
			System.out.print("\t"+f);
			System.out.print("\t"+s);
			f+=2;
			s-=6;
			i+=2;
		}
	}

}
