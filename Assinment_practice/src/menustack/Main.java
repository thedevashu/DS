package menustack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		LL stack =new LL();
		menu(scn,stack);
	}

	private static void menu(Scanner scn, LL stack) {
		int ch;
		System.out.println("Welcome");
		while(true) {
			System.out.println("--------Select_your_option---------");
			System.out.println("1. push\n2.POP\n3.Display\n4. PEEP\n5. print odd");
			ch =scn.nextInt();
			if(ch>5) {
				System.out.println("EXITED!!");
				break;//to break the loop when wrong option is selected
			}
			switch(ch) {
			case 1:{
				System.out.println("Enter element");
				int data=scn.nextInt();
				stack.push(data);
				break;
			}
			case 2:{
				stack.pop();
				System.out.println("Element poped");
				break;
			}
			case 3:{
				System.out.println(stack);
				break;
			}
			case 4:{
				stack.peep();
				break;
			}
			case 5:{
				System.out.println("Odd numbers in stack");
				stack.showOddNo();
				break;
			}
			}
		}
		
	}

	

}
