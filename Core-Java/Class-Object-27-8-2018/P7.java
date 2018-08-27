package com.org;
import java.util.*;
class Employees
{
	private int salary,no_of_hrs;
	void getInfo(int salary,int no_of_hrs)
	{
		this.salary=salary;
		this.no_of_hrs=no_of_hrs;
	}
	void addSal()
	{
		if(salary<500)
		{
			salary+=10;
		}
		System.out.println("Salary:"+salary);
	}
	void addWork()
	{
		if(no_of_hrs>6)
		{
			salary+=5;
		}
		System.out.println("Salary:"+salary);
	}
	
}
public class P7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sal,hrs;
		Scanner s=new Scanner(System.in);
		Employees e=new Employees();
		System.out.println("Enter salary:");
		sal=s.nextInt();
		System.out.println("Enter number of hours per day:");
		hrs=s.nextInt();
		e.getInfo(sal,hrs);
		e.addSal();
		e.addWork();
		

	}

}
