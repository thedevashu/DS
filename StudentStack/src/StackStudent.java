
public class StackStudent {
	Student arr[];
	int top;

	StackStudent(int size){
		arr=new Student[size];
		top =-1;
	}
	public void push(Student s) {
		if(top<arr.length-1) {
			top++;
			arr[top]=s;
		}
		else
			System.out.println("Stack is full");
	}

	public Student pop() {
		Student temp =arr[top];
		if(top>-1) {
			top--;
			return temp;
		}
		else
			System.out.println("Stack is emty");
		return null;

	}
	
	public String toString() {
		String str="";
		for(int i=top;i<arr.length-1;i++) {
		 str+= arr[i];
		}
		return str;
	}

}
