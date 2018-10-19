import java.util.*;
public class P7 {

	public static void main(String[] args) {
		int i;
		String s1;
		char temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		s1=sc.nextLine();
		char st[]=s1.toCharArray();
		temp=st[0];
		st[0]=st[st.length-1];
		st[st.length-1]=temp;
		String s2=new String(st);
		System.out.println("After replacement:"+s2);
		StringBuffer sb=new StringBuffer();
	}

}
