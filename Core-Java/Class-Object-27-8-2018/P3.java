package com.org;
class Triangle
{
	int s1,s2,s3,peri;
	double area;
	Triangle()
	{
		s1=3;
		s2=4;
		s3=5;
		peri=s1+s2+s3;
		int s4=(s1+s2+s3)/2;
		area=Math.sqrt(s4*(s4-s1)*(s4-s2)*(s4-s3));
	}
	Triangle(int s1,int s2,int s3)
	{
		this.s1=s1;
		this.s2=s2;
		this.s3=s3;
		peri=s1+s2+s3;
		int s4=(s1+s2+s3)/2;
		area=Math.sqrt(s4*(s4-s1)*(s4-s2)*(s4-s3));
	}
	void display()
	{
		System.out.println("Perimeter:"+peri);
		System.out.println("Area:"+area);
	}
}
public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1=new Triangle();
		t1.display();
		System.out.println();
		//P4
		Triangle t2=new Triangle(3,4,5);
		t2.display();

	}

}
