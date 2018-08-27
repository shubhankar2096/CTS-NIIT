package com.org;
import java.util.*;
class Average
{
	int n1,n2,n3;
	double avg;
	Scanner s=new Scanner(System.in);
	void cal_avg()
	{
		System.out.println("Enter 3 numbers:");
		n1=s.nextInt();
		n2=s.nextInt();
		n3=s.nextInt();
		avg=(n1+n2+n2)/3;
	}
	void display()
	{
		System.out.println("Average is:"+avg);
	}

}
public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Average a=new Average();
		a.cal_avg();
		a.display();
		
	}

}
