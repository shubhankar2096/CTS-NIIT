package com.org;
class Employees
{
	int eid;
	String ename;
	int salary;
	double bonus;
	
	void check(Employees e)
	{
		if(e instanceof Managers)
		{
			((Managers)e).bonus();
		}
		else
		{
			((contract_emp) e).bonus();
		}
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

class Managers extends Employees
{
	int project_id;
	int no_of_emp;
	void bonus()
	{
		bonus=1.2*salary;
		System.out.println("Salary with bonus is:"+bonus);
	}
}

class contract_emp extends Employees
{
	int conttract_period;
	void bonus()
	{
		bonus=1.15*salary;
		System.out.println("Salary with bonus is:"+bonus);
	}
}
public class If_Instance_of_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For Manager
		Employees em=new Managers();
		em.setSalary(90000);
		em.check(em);
		
		//For contract employee
		Employees ece=new contract_emp();
		ece.setSalary(8000);
		ece.check(ece);
	}

}
