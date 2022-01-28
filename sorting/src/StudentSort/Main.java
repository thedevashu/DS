package StudentSort;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Student std[];
		System.out.println("Enter no. of student");
		Scanner scn =new Scanner(System.in);
		int size =scn.nextInt();
		std= new Student[size];
		
		for(int i=0;i<size;i++) {
			String nm;
			int rn;
			System.out.println("Enter name:");
			nm=scn.next();
			System.out.println("Enter roll no.:");
			rn=scn.nextInt();
			std[i] = new Student(rn,nm);
		}
		Sort.bubble(std, false);
		printStd(std);

	}
	
	public static void printStd(Student arr[]) {
		int i;
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
