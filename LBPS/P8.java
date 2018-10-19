import java.util.*;
public class P8 {

	public static void main(String[] args) {
		int i;
		int cnt_words=0;
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		s1=sc.nextLine();
		for(i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ' || s1.charAt(i)=='.' || s1.charAt(i)=='?')
			{
				cnt_words++;
			}
		}
		System.out.println("Number of words in string are:"+cnt_words);
	}

}
