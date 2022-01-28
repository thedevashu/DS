package dqueue;

public class DQueue {
	Node head;

	public DQueue(){
		head =null;
	}
	
	public void insertFront(int data) {
		Node temp =new Node(data);
		
		if(head ==null) {
			head =temp;
		}
		else {
			temp.setNext(head);
			head =temp;
		}
	}
	
	public void insertBack(int data) {
		Node temp =new Node(data);
		if(head==null) {
		head =temp;
		}
		else {
			Node it=new Node();
			it=head;
			while(it.getNext() != null) {
				it = it.getNext();
			}
			it.setNext(temp);
		}
	}
	
	public void delFirst() {
		if(head == null) {
			System.out.println("Queue is empty");
		}
		
		else {
			Node temp =head;
			head =temp.getNext();
			temp.setNext(null);
		}
	}
	
	public void delLast() {
		if(head == null) {
			System.out.println("List is empty");
		}
		else {
			Node it =head;
			while(it.getNext().getNext() != null) {
				it =it.getNext();
			}
			it.setNext(null);
		}
		
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
