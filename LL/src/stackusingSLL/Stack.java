package stackusingSLL;

public class Stack {
	Node head;

	public Stack(){
		head =null;
	}
	
	public void push(int data) {
		Node temp =new Node(data);
		
		if(head ==null) {
			head =temp;
		}
		else {
			temp.setNext(head);
			head =temp;
		}
	}
	
	
	public void pop() {
		head =head.getNext();
		
	}
	
	public String toString() {
		String str="";
		Node it =head;
		while(it!=null){
			str+=it+" ";
			it=it.getNext();
		}
		return str;
	}
}
