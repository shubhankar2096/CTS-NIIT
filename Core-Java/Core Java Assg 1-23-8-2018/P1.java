import java.util.*;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len,bre;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length:");
		len=s.nextInt();
		System.out.println("Enter breadth:");
		bre=s.nextInt();
		if(len==bre)
		{
			System.out.println("It is Square");
		}
		else
		{
			System.out.println("Not Square");
		}
		s.close();

	}

}
