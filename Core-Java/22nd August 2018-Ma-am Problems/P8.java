
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,counte=0,counto=0;
		for(i=0;i<=100;i++)
		{
			if(i%2==0)
			{
				counte+=i;
			}
			else
			{
				counto+=i;
			}
		}
		System.out.println("Sum of Even numbers:"+counte);
		System.out.println("Sum of odd numbers:"+counto);

	}

}
