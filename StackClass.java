
public class StackClass {
	private int stk[];
	private int top=-1;
	
	public StackClass(int size) {
		stk = new int[size];
		

	}


	public void push(int num) {
		if(top<stk.length-1) {
		top++;
		stk[top]=num;
		}
		
		else
			System.out.println("stack over flow");

	}

	public void pop() {
		
		if(top!=-1)
		{
			top--;
		}
		
		else
			System.out.println("Stack is empty");

	}
	
	public String toString() {
		String str="";
		for(int i=0;i<top;i++) {
			 str+= "--"+stk[i];
		}
		return str;
	}
}
