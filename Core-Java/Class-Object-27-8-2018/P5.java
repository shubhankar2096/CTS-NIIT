package com.org;
import java.util.*;
class Area
{
	private int length,breadth;
	Area(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	int ret_area()
	{
		return length*breadth;
	}
}



public class P5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length and breadth of the rectangle:");
		l=s.nextInt();
		b=s.nextInt();
		Area a=new Area(l,b);
		System.out.println("Area of rectangle is:"+a.ret_area());
		s.close();

	}

}
