package bookinfo;

public class BookList {
	Node head;
	public BookList() {
		head =null;
	}

	public String toString() {
		String str ="";
		Node it =head;
		while(it != null) {
			str+=it+"\n";
			it= it.getNext();
		}
		return str;
	}

	public void insert(Book b1) {
		Node tmp =new Node();
		tmp.setData(b1);
		if(head ==null) {
			//lsit is empty
			head =tmp;
		}
		
		else {
			//list is not empty
			Node it =head;//it to find end
			while(it.getNext() != null) {
				it=it.getNext();
			}
			it.setNext(tmp);
		}
		
	}

	public void updateQ(String bName,int qun) {
		Node it =head;
		while(true) {
			if(bName.equals(it.getData().getName())) {
				break;
			}
			it =it.getNext();
		}
		it.getData().setQuant(it.getData().getQuant() + qun);
		
	}

	public void deleteAll() {
		Node it =head;
		delete(it);
		head =null;
		
	}

	private void delete(Node it) {
		if(it.getNext() != null) {
			delete(it.getNext());
		}
		it.setNext(null);
		
	}
}
