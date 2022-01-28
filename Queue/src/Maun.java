
public class Maun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassQueue q1= new ClassQueue(10);
		q1.insert(100);
		q1.insert(200);
		q1.insert(300);
		q1.insert(200);
		q1.insert(300);
		q1.insert(400);
		q1.insert(500);
		q1.delet();
		q1.delet();
		q1.insert(600);
		//System.out.println(q1);
		
		
		
		
		
		System.out.println(q1);
		ClassQueue q2 =new ClassQueue(10);
		q2.sameAs(q1);
		q2.delet();
		q2.delet();
		System.out.println(q2);
		
		ClassQueue q3 =new ClassQueue(20);
		System.out.println(q3.concat(q1, q2));
		

	}

}
