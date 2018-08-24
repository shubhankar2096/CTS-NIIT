import java.util.*;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m,first,last,sum=0;//m is our number
		System.out.println("Enter number:");
		m=s.nextInt();
		//To get a last digit(dry run such a questions with 1234)
		last=m%10;
		//To get a first digit
		first=m;
		while(first>=10)//(dry run such a questions with 1234)
		{
			first=first/10;
		}
		sum=first+last;
		System.out.println("Sum is:"+sum);
		s.close();
		

	}

}
