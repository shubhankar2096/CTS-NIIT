import java.util.*;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		final int ucost=100;
		int qty;
		double amnt;
		System.out.println("Enter quantity:");
		qty=s.nextInt();
		amnt=qty*ucost;
		if(amnt>1000)
		{
			amnt=amnt-(amnt*0.1);
			System.out.println("Discount applicable! Amount is:"+amnt);
		}
		else
		{
			System.out.println("Discount not applicable! Amount is:"+amnt);
		}
		s.close();

	}

}
