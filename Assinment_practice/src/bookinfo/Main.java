package bookinfo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BookList bookList =new BookList();
		Scanner scn =new Scanner(System.in);
		menu(scn,bookList);

		//		Book b1 =new Book(1,"RDPD",123,499);
		//		Book b2 =new Book(2,"aDPD",23,399);
		//		
		//		bookList.insert(b1);
		//		bookList.insert(b2);
		//		bookList.updateQ("RDPD",-103);
		//		System.out.println(bookList);


	}

	private static void menu(Scanner scn, BookList bookList) {
		System.out.println("__________WEL-COME__________");
		System.out.println("ENTER YOUR CHOICE!!");
		while(true) {
			System.out.println("1. Insert\n2. Display\n3.Update Quantity\n4.Delete all");
			int ch =scn.nextInt();
			if(ch>4) {
				break;
			}
			switch (ch){
			case 1:{
				System.out.println("Book id.");
				int id =scn.nextInt();
				System.out.println("Book Name:");
				String name=scn.next();
				System.out.println("Book Price:");
				int price =scn.nextInt();
				System.out.println("Enter Quantity:");
				int q =scn.nextInt();
				Book b =new Book(id,name,price,q);
				bookList.insert(b);
				break;
			}
			case 2:{
				System.out.println(bookList);
				break;
			}
			case 3:{
				System.out.println("Enter name of book to update");
				String name =scn.next();
				System.out.println("Enter update value");
				int val =scn.nextInt();
				bookList.updateQ(name, val);
				break;
				
			}
			case 4:{
				bookList.deleteAll();
				break;
			}
			}
		}

	}
}
