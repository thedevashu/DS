package stringreversbystack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		String str;
		System.out.println("Enter the string");
		str =scn.nextLine();
		
		StackChar st =new StackChar(str.length());
		char arr[]= str.toCharArray();
		
		for(int i =0;i<arr.length;i++) {
			st.push(arr[i]);
		}
		System.out.println(st);
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(st.pop());
		}
	}
	
	

}
