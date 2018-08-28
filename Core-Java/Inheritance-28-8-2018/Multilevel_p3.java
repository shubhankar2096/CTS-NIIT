package com.org;
class Person3
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

class Employee3 extends Person
{
	protected int salary;
	protected String designation;
	protected String exp;
	protected String department;
	
	void acceptEmployee()
	{
		salary=900000;
		designation="Developer";
		exp="2 years";
		department="IT";
	}
	
	/*void displayAll()
	{
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Mobile:"+mob);
		System.out.println("Address:"+addr);
		System.out.println("Salary:"+salary);
		System.out.println("Designation:"+designation);
		System.out.println("Experience:"+exp);
		System.out.println("Department:"+department);
	}*/
}
class Manager extends Employee
{
	int no_of_emps;
	String project_id;
	String project_name;
	
	void acceptManager()
	{
		no_of_emps=10;
		project_id="P010";
		project_name="Smart Watch";
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
		System.out.println("Number of Employees Working Under:"+no_of_emps);
		System.out.println("Project ID:"+project_id);
		System.out.println("Project Name:"+project_name);
	}
}
public class Multilevel_p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m=new Manager();
		m.acceptPerson();
		m.acceptEmployee();
		m.acceptManager();
		m.displayAll();

	}

}
