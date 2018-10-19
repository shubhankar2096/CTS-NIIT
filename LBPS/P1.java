import java.util.*;
public class P1 {
	void reflex()
	{
		int i,j;
		String s1;
		StringBuffer s2=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		s1=sc.nextLine();
		char k;
		for(i=0;i<s1.length();i++)
		{
			k=s1.charAt(i);
			j=219-(int)k;
			s2.append((char)j);
		}
		System.out.println("Reflection is:"+s2);
	}
	public static void main(String[] args) {
		P1 p=new P1();
		p.reflex();
	}

}
