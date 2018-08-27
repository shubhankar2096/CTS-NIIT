package com.org;
class Emp
{
	private String name,addr;
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	private int yoj;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYoj() {
		return yoj;
	}
	public void setYoj(int yoj) {
		this.yoj = yoj;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	void display()
	{
		System.out.println("Name:"+name+"\tYear of Joining:"+yoj+"\tSalary:"+salary);
	}
}
public class P8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp();
		Emp e2=new Emp();
		Emp e3=new Emp();
		e1.setName("Robert");
		e1.setYoj(1994);
		e1.setSalary(90000);
		e1.setAddr("64C- WallsStreat");
		e1.display();
		
		e2.setName("Sam");
		e2.setYoj(2000);
		e2.setSalary(80000);
		e2.setAddr("68D- WallsStreat");
		e2.display();
		
		e3.setName("John");
		e3.setYoj(1999);
		e3.setSalary(70000);
		e3.setAddr("26B- WallsStreat");
		e3.display();

	}

}
