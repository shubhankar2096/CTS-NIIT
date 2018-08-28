package com.org;
class Vehicle
{
	int id;
	String company_name;
	int eng_no;
	void accept()
	{
		id=9;
		company_name="Honda";
		eng_no=6789;
	}
	void display()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+company_name);
		System.out.println("Engine Number:"+eng_no);
	}
}
class Four_Wheeler extends Vehicle
{
	String name;
	int no_of_seats;
	void acceptFour()
	{
		name="Ciaz";
		no_of_seats=5;
	}
	void display()
	{
		super.accept();
		System.out.println("Name:"+name);
		System.out.println("Number of Seats:"+no_of_seats);
	}
}

class Two_Wheeler extends Vehicle
{
	String name;
	void acceptTwo()
	{
		name="Activa";
	}
	void display()
	{
		super.accept();
		System.out.println("Name:"+name);
	}
}
public class Vehicle_P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Four_Wheeler fw=new Four_Wheeler();
		fw.accept();
		fw.acceptFour();
		fw.display();
		System.out.println();
		Two_Wheeler tw=new Two_Wheeler();
		tw.accept();
		tw.acceptTwo();
		tw.display();
	}

}
