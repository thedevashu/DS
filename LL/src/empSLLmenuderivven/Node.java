package empSLLmenuderivven;

public class Node {
	private Node next;
	private Employee emp;
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Employee getData() {
		return emp;
	}
	public void setData(Employee data) {
		this.emp = data;
	}

	public String toString() {
		String str ="" + emp;
		return str;
	}

	
}
