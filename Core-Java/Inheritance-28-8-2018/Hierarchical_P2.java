package com.org;
class Person1
{
	protected int id;
	protected String name;
	protected long mob;
	protected String addr;
	
	void acceptPerson()
	{
		id=1;
		name="Neha";
		mob=992272;
		addr="126-A Shaniwar Peth";
	}
}

class Employee1 extends Person
{
	int salary;
	String designation;
	String exp;
	String department;
	
	void acceptEmployee()
	{
		salary=900000;
		designation="Developer";
		exp="2 years";
		department="IT";
	}
	
	void displayAll()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Mobile:"+mob);
		System.out.println("Address:"+addr);
		System.out.println("Salary:"+salary);
		System.out.println("Designation:"+designation);
		System.out.println("Experience:"+exp);
		System.out.println("Department:"+department);
	}
}

class Student extends Person
{
	int roll_no;
	String branch;
	String division;
	int batch;
	
	void acceptStudent()
	{
		roll_no=49;
		branch="Computer";
		division="Comp 2";
		batch=2018;
	}
	
	void displayAll()
	{
		System.out.println();
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Mobile:"+mob);
		System.out.println("Address:"+addr);
		System.out.println("Roll_no:"+roll_no);
		System.out.println("Branch:"+branch);
		System.out.println("Division:"+division);
		System.out.println("Batch:"+batch);
	}
}
public class Hierarchical_P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Student s=new Student();
		e.acceptPerson();
		e.acceptEmployee();
		e.displayAll();
		s.acceptPerson();
		s.acceptStudent();
		s.displayAll();
	}

}
