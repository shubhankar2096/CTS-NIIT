import java.util.Scanner;
public class P3 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter amount:");
		amount=s.nextInt();
		if(amount>20000)
		{
			amount=amount-(amount*0.1);
			System.out.println("10% discount and Amount Is:"+amount);
		}
		else if(amount<20000 && amount>5000)
		{
			amount=amount-(amount*0.05);
			System.out.println("5% discount and Amount Is:"+amount);
		}
		else
		{
			System.out.println("No Discount");
		}
		s.close();
	}

}
