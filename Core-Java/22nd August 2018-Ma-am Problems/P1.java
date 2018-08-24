import java.util.*;
public class P1 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number:");
		n=s.nextInt();
		if(n%7==0)
		{
			if(n%2==0)
			{
				System.out.println("Valid!! Divisible by 7 and even");
			}
			else
			{
				System.out.println("Invalid");
			}
		}
		else
		{
			System.out.println("Invalid");
		}
		
		s.close();
	}

}
