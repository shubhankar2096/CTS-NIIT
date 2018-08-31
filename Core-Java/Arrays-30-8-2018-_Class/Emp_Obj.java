import java.util.*;
class Employees
{
	int id;
	String name;
	int mob;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMob(int mob) {
		this.mob = mob;
	}
	Scanner s=new Scanner(System.in);
	public int getId() {
		return id;
	}
	void accept()
	{
		System.out.println("Enter ID:");
		this.id=s.nextInt();
		System.out.println("Enter Name:");
		this.name=s.next();
		System.out.println("Enter Mobile:");
		this.mob=s.nextInt();
	}
	void display()
	{
		System.out.println("Employee ID:"+id);
		System.out.println("Employee ID:"+name);
		System.out.println("Employee ID:"+mob);
	}
}
public class Emp_Obj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e[]=new Employees[10];
		int i,ch;
		char ans;
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("1)Insert\n2)Display\n3)Update\n4)Delete\n5)Exit");
		System.out.println("Enter your choice:");
		ch=s.nextInt();
		switch(ch)
		{
		case 1:
			for(i=0;i<3;i++)
			{
				e[i]=new Employees();
				e[i].accept();
			}
		break;
		
		case 2:
			for(i=0;i<3;i++)
			{
				e[i].display();
				System.out.println();
			}
		break;
		
		case 3:
			System.out.println("Enter employees ID to be Updated:");
			int b=s.nextInt();
			System.out.println("Enter employees mobile to be Updated:");
			int mob=s.nextInt();
			e[b-1].setMob(mob);
			e[b-1].display();
		break;
		
		case 4:
			System.out.println("Enter employee id to be deleted:");
			int c=s.nextInt();
			e[c-1].setMob(0);
			e[c-1].setName(null);
			e[c-1].setId(0);
		break;
		
		case 5:
			System.exit(0);
		break;
		
		}
		System.out.println("Wanna Continue?");
		ans=s.next().charAt(0);
	}
		while(ans=='Y'||ans=='y');

}
}