import java.util.*;
public class P6 {
	public static void main(String[] args) {
		int i;
		String s1;
		StringBuffer s2=new StringBuffer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		s1=sc.next();
		for(i=0;i<s1.length();i+=2)
		{
			s2.append(s1.charAt(i));
		}
		System.out.println("Characters in alternate position are:"+s2);
	}

}
