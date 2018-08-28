package com.org;
class Hotel
{
	int hid;
	String hname;
	String city;
	
	void accept()
	{
		hid=90;
		hname="Grand Hotel";
		city="Pune";
	}
	void display()
	{
		System.out.println("Hotel ID:"+hid);
		System.out.println("Hotel Name:"+hname);
		System.out.println("City:"+city);
	}
}
class Room extends Hotel
{
	int rid;
	String rtype;
	void accept()
	{
		super.accept();
		rid=303;
		rtype="Deluxe";
	}
	void display()
	{
		super.display();
		System.out.println("Room ID:"+rid);
		System.out.println("Room Type:"+rtype);
	}
}
public class Hotel_P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room r=new Room();
		r.accept();
		r.display();
	}

}
