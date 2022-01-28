
public class LL {
	Node head;
	public LL() {
		head =null;
	}

	public void insert(int data) {
		Node temp=new Node();
		temp.setData(data);

		if(head == null) {
			head =temp;
		}
		else {
			temp.setNext(head);
			head =temp;
		}

	}
	public void delOddNode() {
		int n =noOfNodes();
		int rem =n%2;
		n =(n/2) + rem;
		int i=1;
		while((n) != 0) {
			delnode(i);
			i++;
			n--;
		}
	}
	private void delnode(int pos) {
		int nodeC = noOfNodes();
		Node temp =head;
		if(pos == 1) {
			head =temp.getNext();
			temp.setNext(null);
		}
		else if(pos>1 && pos<=nodeC) {
			while(pos > 2) {
				temp =temp.getNext();
				pos--;
			}
			Node nextNode =temp.getNext();
			temp.setNext(nextNode.getNext());
			nextNode.setNext(null);
		}
	}

	public void searchByData(int data) {
		Node temp = head;
		int pos=1;
		while(temp.getNext() != null) {
			if(temp.getData() == data) {
				System.out.println(pos);
			}
			pos++;
			temp =temp.getNext();
		}
	}
	private int noOfNodes() {
		int n = 1;
		Node it =head;
		while(it.getNext() != null) {
			n++;
			it =it.getNext();
		}
		return n;
	}

	public String toString() {
		String str ="";
		Node it =head;
		while(it != null) {
			str+=it+"-->";
			it= it.getNext();
		}
		return str;
	}

	public void revPrint() {
		Node it =head;
		print(it);
	}

	private void print(Node it) {
		if(it != null) {
			print(it.getNext());
			System.out.print(it.getData()+"-->");
		}

	}

	public void sortLL() {
		Node it,itn;
		int swap ;
		while(true) {
			swap =0;
			it =head;
			itn =head.getNext();
//			Node itp =null;
			do { 
				//itrate loop until itn.next is not null
				if(it.getData()>itn.getData()) {
					int temp = it.getData();
					it.setData(itn.getData());
					itn.setData(temp);

					swap++;//check for swap
				}
				//itp=itn;
				it=itn;
				itn =itn.getNext();
				
			}while(itn != null);
			if(swap == 0)//if swap happens loop continues
			{break;}

		}
	}

	public void merg(LL list2) {
		Node it =this.head;
		//take it to itrate from head of first node
		while(it.getNext() != null) {
			it=it.getNext();
		}
		it.setNext(list2.head);
		//make last node to point second nodes head
		list2.head=this.head;//make only one head
		
		
	}
}
