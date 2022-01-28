package stackaddition;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1 =new Stack(5);
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.pop();
		s1.pop();
		
		Stack s2 = new Stack(5);
		s2.push(20);
		s2.push(30);
		s2.push(23);
		s2.pop();
		s2.push(40);
		
		Stack s3 = new Stack(5);
		s3.addStack(s1,s2);
		
		System.out.println(s3);
	}

}
