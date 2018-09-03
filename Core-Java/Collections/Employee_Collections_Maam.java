import java.util.*;
class Emp_Data
{
	int id;
	String name;
	double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}

class Emp_Data_Test
{
	void DB()
	{
		int i,id,ch;
		char ans;
		int n;
		Scanner sc=new Scanner(System.in);
		ArrayList l=new ArrayList();
		Emp_Data e;
		do
		{
			System.out.println("1)Create List\n2)Insert\n3)Display\n4)Update\n5)Delete\n6)Search\n7)Exit");
			System.out.println("Enter your choice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter number of employees");
				n=sc.nextInt();
				for(i=1;i<=n;i++)
				{
					e=new Emp_Data();
					System.out.println("Enter employee "+i+" details:");
					e.setId(sc.nextInt());
					e.setName(sc.next());
					e.setSalary(sc.nextDouble());
					l.add(e);
				}
				break;
				
			case 2:
				e=new Emp_Data();
				System.out.println("Enter employee details:");
				e.setId(sc.nextInt());
				e.setName(sc.next());
				e.setSalary(sc.nextDouble());
				l.add(e);
				//n++;
				break;
				
			case 3:
				Iterator itr=l.iterator();
				System.out.println("\tID\tName\tSalary");
				while(itr.hasNext())
				{
					Emp_Data e1=(Emp_Data) itr.next();
					System.out.println("\t"+e1.getId()+"\t"+e1.getName()+"\t"+e1.getSalary());
				}
				//System.out.println(l.get(0));
				break;
				
			/*case 4://Working Update 1
				System.out.println("Enter employee ID to be updated:");
				id=sc.nextInt();
				//e=new Emp_Data();
				for(i=1;i<=l.size();i++)
				{
					if(i==id)
					{
						e=new Emp_Data();
						System.out.println("Enter employee details to be updated:");
						e.setId(id);
						e.setName(sc.next());
						e.setSalary(sc.nextDouble());
						l.remove(id-1);
						l.add(e);
						System.out.println(l);//It stores list of objects
						break;
						
					}
				}
				break;*/
				
			case 4://Update Final
				System.out.println("Enter employee ID to be updated:");
				id=sc.nextInt();
				//e=new Emp_Data();
				for(i=0;i<l.size();i++)
				{
					Emp_Data e5=(Emp_Data) l.get(i);//to get an object in ArrayList l of type Emp_Data 
					if(id==e5.getId())
					{
						//e=new Emp_Data();
						System.out.println("Enter employee details to be updated:");
						e5.setId(id);
						e5.setName(sc.next());
						e5.setSalary(sc.nextDouble());
						l.remove(e5);
						l.add(e5);
						System.out.println(l);//It stores list of objects
						break;
						
					}
				}
				break;
				
			case 5:
				System.out.println("Enter employee ID to be deleted:");
				id=sc.nextInt();
				for(i=0;i<l.size();i++)
				{
					Emp_Data e5=(Emp_Data) l.get(i);
					if(id==e5.getId())
					{
						l.remove(e5);
						break;
					}
				}
				break;
				
			/*case 6://Working Search 1
				System.out.println("Enter employee ID to be searched:");
				id=sc.nextInt();
				Iterator itr1=l.iterator();
				System.out.println("\tID\tName\tSalary");
				for(i=0;i<l.size();i++)
				{
					if(i==id-1)
					{
						Emp_Data e1=(Emp_Data) l.get(i);
						System.out.println("\t"+e1.getId()+"\t"+e1.getName()+"\t"+e1.getSalary());
						break;
					}
				}
				break;*/
				
			case 6://Search Final
				System.out.println("Enter employee ID to be searched:");
				id=sc.nextInt();
				System.out.println("\tID\tNam\tSalary");
				for(i=0;i<l.size();i++)
				{
					Emp_Data e5=(Emp_Data) l.get(i);
					if(id==e5.getId())
					{
						System.out.println("\t"+e5.getId()+"\t"+e5.getName()+"\t"+e5.getSalary());
						break;
					}
				}
				break;
				
			case 7:
				System.exit(0);
			}
			System.out.println("Wanna Continue?");
			ans=sc.next().charAt(0);
		}
		while(ans=='Y' || ans=='y');
	}
}
public class Employee_Collections_Maam {

	public static void main(String[] args) {
		Emp_Data_Test t=new Emp_Data_Test();
		t.DB();
	}
}
