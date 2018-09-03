//MR ASsignment
import java.util.*;
import java.util.Map.Entry;
class Employee
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

class Employees_Test
{
	void DB()
	{
		int i,id,n;
		Employee e;
		HashMap<Integer,Object> hm=new HashMap(); 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of employees:");
		n=sc.nextInt();
		for(i=0;i<n;i++)//To add employee details
		{
			e=new Employee();
			System.out.println("Enter employee details:");
			e.setId(sc.nextInt());
			e.setName(sc.next());
			e.setSalary(sc.nextDouble());
			hm.put(i+1,e);
		}
		
		System.out.println("\tID\tName\tSalary");
		for(i=0;i<hm.size();i++)//To display all
		{
			Employee e1=(Employee) hm.get(i+1);
			System.out.println("\t"+e1.getId()+"\t"+e1.getName()+"\t"+e1.getSalary());
		}
		
		System.out.println("Enter employee ID:");
		id=sc.nextInt();
		System.out.println("\tID\tName\tSalary");
		for(i=0;i<hm.size();i++)//To display records of particular employee ID
		{
			Employee e1=(Employee) hm.get(i+1);
			if(id==e1.getId())
			{
				System.out.println("\t"+e1.getId()+"\t"+e1.getName()+"\t"+e1.getSalary());
				break;
			}
		}
	}
}
public class Emp_Hash_Map {

	public static void main(String[] args) {
		Employees_Test et=new Employees_Test();
		et.DB();
	}
}
