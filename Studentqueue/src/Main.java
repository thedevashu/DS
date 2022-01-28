
public class Main {

	public static void main(String[] args) {
		Student s1 =new Student(1,"asdf",76.00f);
		Student s2 =new Student(1,"asdf",74.00f);
		Student s3 =new Student(1,"asdf",75.00f);
		
		ClassQueue q1=new ClassQueue(3);
		
		q1.insert(s1);
		q1.insert(s2);
		q1.insert(s3);
		q1.firstClass();
	}

}
