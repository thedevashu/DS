
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 =new Student(123,"asf",true);
		Student s2 =new Student(124,"hsf",true);
		Student s3 =new Student(125,"adthf",false);
		
		StackStudent s=new StackStudent(3);
		
		s.push(s1);
		s.push(s2);
		s.push(s3);
		System.out.println(s.pop());
		s.push(s1);
		
		
	}

}
