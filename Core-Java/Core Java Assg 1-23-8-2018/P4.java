import java.util.*;
public class P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double class_attend,class_held;
		double attnd;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of classes attended by a student:");
		class_attend=s.nextInt();
		System.out.println("Enter number of classes held:");
		class_held=s.nextInt();
		attnd=(class_attend/class_held);
		System.out.println(attnd);
		if(attnd<0.75)
		{
			System.out.println("Not allowed for exam");
		}
		else
		{
			System.out.println("Allowed for exam");
		}
		s.close();

	}

}
