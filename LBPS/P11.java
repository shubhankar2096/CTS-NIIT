import java.util.Scanner;
public class P11 {

	public static void main(String[] args) {
		int i;
		String input1="xaXafxsd";
		String s1;
		for(i=0;i<input1.length();i++)
		{
			if(input1.charAt(i)=='x')
			{
				s1=input1.charAt(i)+"";
				input1=input1.replaceFirst(s1,"");
				input1+='x';
			}
		}
		System.out.println("After replacement:"+input1);
	}

}
