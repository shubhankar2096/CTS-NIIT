package com.org;
class Person
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

class Employee extends Person
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
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		e.acceptPerson();
		e.acceptEmployee();
		e.displayAll();

	}

}
//Single Inheritance