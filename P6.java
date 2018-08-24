import java.util.Scanner;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		num=s.nextInt();
		while(num>=1)
		{
			fact=fact*num;
			num=num-1;
		}
		System.out.println("Factorial is:"+fact);
		s.close();

	}

}
