package com.org;
class Bank_Ac
{
	int ac_no;
	int IFSC;
	String name;
	
	void acceptBank_Ac()
	{
		ac_no=1;
		IFSC=8990;
		name="Neha";
	}
}
class Saving_Ac extends Bank_Ac
{
	int balance;
	double intrest_rate;
	
	void acceptSaving_Ac()
	{
		balance=90000;
		intrest_rate=5.4;
	}
	
	void displaySaving_Ac()
	{
		System.out.println("Account Number:"+ac_no);
		System.out.println("IFSC code:"+IFSC);
		System.out.println("Account holder Name:"+name);
		System.out.println("Balance:"+balance);
		System.out.println("Intrest Rate:"+intrest_rate);
	}
}

class Current_Ac extends Bank_Ac
{
	int balance;
	double intrest_rate;
	
	void acceptCurrent_Ac()
	{
		balance=90000;
	}
	
	void displayCurrent_Ac()
	{
		System.out.println("Account Number:"+ac_no);
		System.out.println("IFSC code:"+IFSC);
		System.out.println("Account holder Name:"+name);
		System.out.println("Balance:"+balance);
	}
}
public class Bank_P4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Saving_Ac sa= new Saving_Ac();
		Current_Ac ca =new Current_Ac();
		sa.acceptBank_Ac();
		sa.acceptSaving_Ac();
		sa.displaySaving_Ac();
		System.out.println();
		ca.acceptBank_Ac();
		ca.acceptCurrent_Ac();
		ca.displayCurrent_Ac();

	}

}
