import java.util.*;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,num,dec=0,m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter binary number:");
		num=s.nextInt();
		m=num;
		while(m!=0)
		{
			n=m%10;
			if(n==1)
			{
				dec+=Math.pow(2, i);
			}
			m=m/10;
			i++;
		}
		System.out.println("Decimal number is:"+dec);
		char z='A';
		z++;
		System.out.println(z);
		s.close();

	}

}
