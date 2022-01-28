
public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 =new Employee("ASDF",123,10000);
		Employee e2 =new Employee("AwrDF",13,13000);
		Employee e3 =new Employee("wrgF",23,10040);
		
		EmployeeQueue q =new EmployeeQueue(3);
		q.insertEmp(e1);
		q.insertEmp(e2);
		q.insertEmp(e3);
		System.out.println(q);
		System.out.println("--------");
		q.deletEmp();
		System.out.println(q);
	}

}
