import java.util.*;
public class P12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a,b and c on green ticket:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a==b && b==c && a==c)
		{
			System.out.println("Reult:20");
		}
		else if(a!=b && b!=c && a!=c)
		{
			System.out.println("Reult:0");
		}
		else if(a==b || b==c || a==c)
		{
			System.out.println("Reult:10");
		}
		s.close();

	}

}
