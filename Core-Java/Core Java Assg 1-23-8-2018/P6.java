import java.util.*;
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,reversed=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number:");
		m=s.nextInt();
		while(m>0)
		{
			n=m%10;
			reversed=(reversed*10)+n;
			m=m/10;
		}
		System.out.println("Reversed is:"+reversed);
		s.close();

	}

}
