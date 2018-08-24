import java.util.*;
public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*For capital alphabets 65 – 90
		For small alphabets 97 – 122
		For digits 48 – 57*/
		char b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter character:");
		b=s.next().charAt(0);//to accept character- at index 0
		if(b>=65 && b<=90)
		{
			System.out.println("Capital Alphabet");
		}
		else if(b>=97 && b<=122)
		{
			System.out.println("Small Alphabet");
		}
		else if(b>=48 && b<=57)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
		
		s.close();
	}

}
