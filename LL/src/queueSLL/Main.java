package queueSLL;

public class Main {

	public static void main(String[] args) {
		LL l1=new LL();
		l1.insert(12);
		l1.insert(22);
		l1.insert(32);
		l1.insert(42);
		System.out.println(l1);
		l1.delete();
		l1.delete();
		System.out.println(l1);
	}

}
