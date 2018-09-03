import java.util.*;
public class Employee_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List empid=new ArrayList();
		List empname=new ArrayList();
		List empmob=new ArrayList();
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
				int id,mob;
				String name;
				System.out.println("Enter employee id:");
				id=s.nextInt();
				System.out.println("Enter employee name:");
				name=s.next();
				System.out.println("Enter employee mobile:");
				mob=s.nextInt();
				empid.add(id);
				empname.add(name);
				empmob.add(mob);
				break;
				
			case 2:
				for(int eid=0;eid<empid.size();eid++)
				{
					System.out.println(empid.get(eid)+"\t"+empname.get(eid)+"\t"+empmob.get(eid));
				}
				break;
				
			case 3:
				System.out.println("Employee employee id to be updated:");
				int eid=s.nextInt();
				System.out.println("Employee employee name to be updated:");
				String ename=s.next();
				System.out.println("Employee employee mobile to be updated:");
				int emob=s.nextInt();
				empname.add(eid-1,ename);
				empmob.add(eid-1,emob);
				break;
				
			case 4:
				System.out.println("Employee employee id to be deleted:");
				int eid1=s.nextInt();
				empid.remove(eid1-1);
				empname.remove(eid1-1);
				empmob.remove(eid1-1);
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
