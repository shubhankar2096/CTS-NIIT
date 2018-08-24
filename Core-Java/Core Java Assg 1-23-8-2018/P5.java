import java.util.*;
public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		char gender,mari_stat;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age:");
		age=s.nextInt();
		System.out.println("Enter gender:");
		gender=s.next().charAt(0);
		System.out.println("Enter maritial status:");
		mari_stat=s.next().charAt(0);
		if(gender=='F')
		{
			System.out.println("Allowed to work in urban area only");
		}
		else if((gender=='M') && (age>=20 && age<=40))
		{
			System.out.println("Allowed to work anywhere");
		}
		else if((gender=='M') && (age>=40 && age<=60))
		{
			System.out.println("Allowed to work in urban area only");
		}
		else
		{
			System.out.println("Error");
		}
		s.close();

	}

}
/*if employee is a male and age is in between 20 to 40 then he may work in anywhere

if employee is male and age is in between 40 t0 60 then he will work in urban areas only.

And any other input of age should print "ERROR".*/
