package stringreversbystack;

public class StackChar {
	char arr[];
	int top;

	StackChar(int size){
		arr=new char[size];
		top =-1;
	}
	public void push(char s) {
		if(top<arr.length-1) {
			top++;
			arr[top]=s;
		}
		else
			System.out.println("Stack is full");
	}

	public char pop() {
		char temp =arr[top];
		if(top>-1) {
			top--;
			return temp;
		}
		else
			System.out.println("Stack is emty");
		return '\0';

	}
	
	public String toString() {
		String str ="";
		for(int i=0;i<=top;i++) {
		str+=arr[i];	
		}
		return str;
		}
}
