package com.org;

class Student
{
	int roll_no,phone;
	String name,addr;
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setRoll_no(2);
		s.setName("John");
		System.out.println("Roll Number:"+s.getRoll_no());
		System.out.println("Name:"+s.getName());
	}
}
