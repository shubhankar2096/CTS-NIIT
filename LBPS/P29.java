import java.util.Scanner;
class stringComp
{
	void stringComp1(String ip1,String ip2)
	{
		int i;
		String op="",temp;
		if(ip1.equals(ip2))
		{
			op=ip1+ip2;
		}
		else
		{
			if(ip1.length()<ip2.length())
			{
				temp=ip1;
				ip1=ip2;
				ip2=temp;
			}
			int l1=ip1.length();
			int l2=ip2.length();
			for(i=l1-l2;i<l1;i++)
			{
				op+=ip1.charAt(i);
			}
			op+=ip2;
		}
		System.out.println("Output of "+ip1+" and "+ip2+" is:"+op);
	}
}
public class P29 {

	public static void main(String[] args) {
		stringComp s1=new stringComp();
		String ip1;
		String ip2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings:");
		ip1=sc.nextLine();
		ip2=sc.nextLine();
		s1.stringComp1(ip1,ip2);

	}

}
