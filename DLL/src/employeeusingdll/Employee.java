package employeeusingdll;

public class Employee {
	private String gender;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	private int id;
	private int salary;
	
	Employee(String name,int id,int sal,String gender){
		this.name =name;
		this.id =id;
		this.salary =sal;
		this.gender =gender;
		
	}
	
	public String toString() {
		String str ;
		str ="Name:"+name+"	Id:"+id+"	Salary:"+salary + "	Gender:"+gender;
		return str;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
