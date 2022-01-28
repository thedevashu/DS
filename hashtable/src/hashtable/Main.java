package hashtable;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println(" Size of array");
		Scanner scn = new Scanner(System.in);
		int size =scn.nextInt();
//		String input;
		StringTable st =new StringTable(size);
		for(int i =0;i<size;i++) {
			System.out.println("Enter Input!!");
			st.insert(scn.next());
		}
		System.out.println("What to search?");
		while(true) {
			st.search(scn.next());
		}
	}	

}
