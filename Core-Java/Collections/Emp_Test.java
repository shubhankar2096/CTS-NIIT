import java.util.*;
class Employees
{
	int id,mob;
	String name;
	List emp=new ArrayList();
	public List getEmp() {
		return emp;
	}
	public void setEmp(List emp) {
		this.emp = emp;
	}
}
public class Emp_Test {

	public static void main(String[] args) {
		int i,ch;
		char ans;
		Scanner s=new Scanner(System.in);
		Employees e[]=new Employees[3];
		List emp=new ArrayList();
		do
		{
			System.out.println("1)Insert\n2)Display\n3)Update\n4)Delete\n5)Exit");
			System.out.println("Enter your choice:");
			ch=s.nextInt();
			switch(ch)
			{
			case 1:
				int id,mob;
				String name;
				int k;
				
				for(k=0;k<2;k++)
				{
					e[k]=new Employees();
					System.out.println("Enter employee id:");
					id=s.nextInt();
					System.out.println("Enter employee name:");
					name=s.next();
					System.out.println("Enter employee mobile:");
					mob=s.nextInt();
					//List emp=new ArrayList();
					/*emp.add(id);
					emp.add(name);
					emp.add(mob);*/
					e[k].emp.add(id);
					e[k].emp.add(name);
					e[k].emp.add(mob);
				}
				break;
				
			case 2:
				for(int eid=0;eid<2;eid++)
				{
					System.out.println(e[eid].emp);
				}
				break;
				
			case 3:
				System.out.println("Employee employee id to be updated:");
				int eid=s.nextInt();
				System.out.println("Employee employee name to be updated:");
				String ename=s.next();
				System.out.println("Employee employee mobile to be updated:");
				int emob=s.nextInt();
				//List emp=new ArrayList();
				//e[eid-1].emp.removeAll(emp);
				e[eid-1].emp.remove(2);
				e[eid-1].emp.remove(1);
				//e[eid-1].emp.add(eid);
				e[eid-1].emp.add(ename);
				e[eid-1].emp.add(emob);
				break;
				
			case 4:
				System.out.println("Employee employee id to be deleted:");
				int eid1=s.nextInt();
				e[eid1-1].emp.retainAll(emp);
				break;
			
			case 5:
				System.exit(0);
			}
		
		System.out.println("Wanna Continue?");
		ans=s.next().charAt(0);
		}
		while(ans=='Y' || ans=='y');
	}

}
