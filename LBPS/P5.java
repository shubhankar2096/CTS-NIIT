import java.util.*;
public class P5 {
	public static void main(String[] args) {
		int i;
		int count=0;
		String s1[]= {"100","111","10100","10","1111"};
		for(i=0;i<s1.length;i++)
		{
			if(s1[i].startsWith("10") && s1[i]!="10")
			{
				System.out.print("\t"+s1[i]);
				count++;
			}
		}
		System.out.println("\nNumber of strings starts with 10 are:"+count);
	}

}
