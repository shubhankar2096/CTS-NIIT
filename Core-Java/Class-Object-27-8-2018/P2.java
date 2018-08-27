package com.org;



public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		s1.setRoll_no(2);
		s1.setName("John");
		s1.setAddr("126-A Shaniwar Peth");
		s1.setPhone(237098);
		System.out.println("Roll Number:"+s1.getRoll_no());
		System.out.println("Name:"+s1.getName());
		System.out.println("Address:"+s1.getAddr());
		System.out.println("Phone Number:"+s1.getPhone());
		
		System.out.println();
		s1.setRoll_no(1);
		s1.setName("Sam");
		s1.setAddr("300 Shaniwar Peth");
		s1.setPhone(679968);
		System.out.println("Roll Number:"+s1.getRoll_no());
		System.out.println("Name:"+s1.getName());
		System.out.println("Address:"+s1.getAddr());
		System.out.println("Phone Number:"+s1.getPhone());
		

	}

}
