import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size;
		System.out.println("Enter size of stack");
		Scanner scn =new Scanner(System.in);
		size =scn.nextInt();
		StackClass s =new StackClass(size);
		boolean b=true;
		while(b) {
			System.out.println("Enter 1 to push\nEnter 2 to pop");
			int ch =scn.nextInt();
			switch(ch) {
				case 1:
					System.out.println("Enter element to be pushed");
					int el=scn.nextInt();
					s.push(el);
					break;
				case 2:
					s.pop();
					System.out.println("you poped element");
					break;
				default:
					b=false;
			}
		}
		
		
		System.out.println(s);
	}

}
