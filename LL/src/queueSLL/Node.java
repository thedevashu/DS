package queueSLL;



public class Node {
	private int data;
	private Node next;
	
	public Node(int d) {
		data =d;
		next =null;
	}
	
	public Node() {
		// TODO Auto-generated constructor stub
		next =null;
	}

	public String toString() {
		String str="";
		str =data+"-->";
		
		return str;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int  e) {
		this.data = e;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
