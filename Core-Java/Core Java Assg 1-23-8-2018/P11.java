import java.util.*;
public class P11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n1r,n2l;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two numbers within range 10 to 99:");
		n1=s.nextInt();
		n2=s.nextInt();
		n1r=n1%10;
		n2l=n2/10;
		if(n1<10 || n1>99 || n2<10 || n2>99)
		{
			System.out.println("Invalid input");
		}
		else if(n1r==n2l)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		s.close();

	}

}
