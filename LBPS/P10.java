import java.util.Scanner;
class Patt1
{
	void remove()
	{
		int i,count=0;
		String s1[]= {"apple","orange","grapes"};
		String s2[]= {"melon","apple","mango"};
		String op[]=new String[5];
		for(i=0;i<s1.length;i++)
		{
			if(!(s1[i].startsWith("a") || s1[i].startsWith("g")))
			{
				op[count++]=s1[i];
			}
		}
		for(i=0;i<s2.length;i++)
		{
			if(!(s2[i].endsWith("n") || s1[i].endsWith("e")))
			{
				op[count++]=s2[i];
			}
		}
		System.out.println("Output array final is:");
		for(i=0;i<count;i++)
		{
			System.out.print(op[i]+"\t");
		}
	}
}
public class P10 {

	public static void main(String[] args) {
		Patt1 p1=new Patt1();
		p1.remove();
	}

}
