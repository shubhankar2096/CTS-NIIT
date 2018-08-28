package com.org;
class A
{
	int a;
	A()
	{
		System.out.println("In default of parent.");
	}
	A(int b)
	{
		System.out.println("In parameterized of parent.");
	}
}
class B extends A
{
	int d;

	B(int c) {
		super(c);//To invoke parameterized constructor of A i.e. Parent class explicitly. If not super(c) is will implicitly i.e. automatically invoke default A() constructor of A i.e. parent class.
		System.out.println("In parameterized of child:"+c);
	}
	
	
}
public class SCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a=n
		B b=new B(5);
		//System.out.println(a.a);
		

	}

}
