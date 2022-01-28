//note has data and reference of next note
public class Node {
	private int data;
	private Node next;
	
	public Node(int d) {
		data =d;
		setNext(null);
	}
	public Node(int d,Node n) {
		data =d;
		setNext(n);
	}
	
	public String toString() {
		String str ="";
		str = ""+ data + "-->";
		return str;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
