import java.util.*;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,num,a,m;
		String bin="";
		String x="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter deciman number:");
		num=s.nextInt();
		m=num;
		while(m!=0)
		{
			a=m%2;
			x=x+""+a;
			m=m/2;
		}
		for(i=x.length()-1;i>=0;i--)
		{
			bin=bin+""+x.charAt(i);
		}
		
		System.out.println("Binary of "+num+" is:"+bin);
		s.close();

	}

}
