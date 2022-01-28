package characterstack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharStack s =new CharStack(5);
		s.insert('a');
		s.insert('b');
		s.insert('e');
		s.insert('i');
		s.insert('c');
		s.delet();
		s.delet();
		s.delet();
		s.delet();
		s.delet();
		System.out.println(s);
		s.vowels(s);
	}

}
