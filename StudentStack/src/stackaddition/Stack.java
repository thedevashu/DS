package stackaddition;

public class Stack {
	private int arr[];
	private int top;
	
	public Stack(int size) {
		arr =new int[size];
		top=-1;
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("Stack Empty");
			return 0;
		}
		else {
			int val =arr[top];
			top--;
			return val;
		}
		
	}
	
	public void push(int val) {
		if(top == arr.length-1) {
			System.out.println("Stack Full");
		}
		else {
			top++;
			arr[top] =val;
		}
	}

	public int[] getArr() {
		return arr;
	}
	public void setArr(int arr[]) {
		this.arr = arr;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	
	public String toString() {
		String str ="";
		for(int i =0;i<=top;i++) {
			str+=arr[i]+",";
		}
		return str;
	}

	public void addStack(Stack s1, Stack s2) {
		int i;
		if(s1.top<s2.top)
			this.top = s2.top;
		else
			this.top = s1.top;
		for( i=0;i<=s1.top && i<=s2.top ; i++) {
			this.arr[i] = s1.arr[i]+s2.arr[i];
		}
		while(i<=s1.top) {
			this.arr[i] = s1.arr[i];
			i++;
		}
		while(i<=s2.top) {
			this.arr[i] = s2.arr[i];
			i++;
		}
		
	}

}
