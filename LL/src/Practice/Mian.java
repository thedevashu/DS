package Practice;

public class Mian {

	public static void main(String[] args) {
		LL l1=new LL();
//		l1.insertFront(5);
		l1.insertFront(4);
		l1.insertFront(3);
		l1.insertFront(2);
		l1.insertFront(1);

		
		System.out.println(l1);
		l1.delOddNode();
		System.out.println(l1);
	}

}
