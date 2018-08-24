import java.util.*;
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		char grade;
		Scanner s=new Scanner(System.in);/*
		a. Below 25 - F
		b. 25 to 45 - E
		c. 45 to 50 - D
		d. 50 to 60 - C
		e. 60 to 80 - B
		f. Above 80 - A
		*/
		System.out.println("Enter marks:");
		marks=s.nextInt();
		if(marks<25)
		{
			grade='F';
		}
		if(marks>=25 && marks<45)
		{
			grade='E';
		}
		if(marks>=45 && marks<50)
		{
			grade='D';
		}
		if(marks>=50 && marks<60)
		{
			grade='C';
		}
		if(marks>=60 && marks<=80)
		{
			grade='B';
		}
		else
		{
			grade='A';
		}
		System.out.println("Grade obtained is:"+grade);
		s.close();
		

	}

}
