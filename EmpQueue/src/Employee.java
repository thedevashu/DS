
public class Employee {
	String name;
	int id;
	int salary;
	
	Employee(String name,int id,int sal){
		this.name =name;
		this.id =id;
		this.salary =sal;
		
	}
	
	public String toString() {
		String str ;
		str ="Name:"+name+"\nId:"+id+"\nSalary:"+salary;
		return str;
	}
}
