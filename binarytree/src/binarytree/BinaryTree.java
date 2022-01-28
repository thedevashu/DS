package binarytree;

public class BinaryTree {
	Node root;

	public BinaryTree(){
		root =null;
	}
	public void insert(int data) {
		Node temp =new Node();
		temp.setData(data);
		Node it= root;//it node for itration

		//if root is null
		if(root == null) {
			root = temp;
			return;
		}
		//root is not null
		while(true) {	
			if(it.getData() > temp.getData()) {
				//input data is smaller so go to left
				if(it.getLeft() != null) {//if left is null then stop
					it =it.getLeft(); 
				}
				else {
					it.setLeft(temp);//set it left which is null to temp
					break;
				}
			}
			else if(it.getData()<temp.getData()) {
				//input is greater so go right
				if(it.getRight() != null) {
					it =it.getRight();
				}
				else {
					it.setRight(temp);
					break;
				}
				
			}
			else {
				System.out.println("Duplicate element");
			}
		}
	}
	public void print() {
		Node it =root;
//		System.out.println("Inorder");
//		inOrder(it);
//		System.out.println("\nPreorder");
//		preOrder(it);
		System.out.println("\nPostorder");
		postOrder(it);
		
	}
	private void postOrder(Node it) {
		if(it != null) {
			postOrder(it.getLeft());
			postOrder(it.getRight());
			System.out.print(it.getData() + ",");
			
		}
		
	}
	private void preOrder(Node it) {
		if(it != null) {
			System.out.print(it.getData() + ",");
			preOrder(it.getLeft());
			preOrder(it.getRight());
			
		}
		
	}
	private void inOrder(Node it) {
		if(it != null) {
			inOrder(it.getLeft());
			System.out.print(it.getData() + ",");
			inOrder(it.getRight());
			
		}
		
	}
	
	public void search(int val) {
		if(root == null) {
			System.out.println("Empty");
			return;
		}
		Node it =root;
		while(true) { 
			if(it == null) {
				System.out.println("\nNot Found!!");
				break;
			}
		if(val < it.getData()) {
			//go left
			it=it.getLeft();
		}
		else if(val >it.getData()) {
			//go right
			it=it.getRight();
		}
		else {	
			System.out.println("\nFound");
			break;
			}
		}
	}

	public void printMax() {
		if(root == null) {
			System.out.println("Empty");
		}
		else {
			Node it =root;
			while(true) {
				if(it.getRight() == null) {
					System.out.println("Max element is "+it.getData());
					break;
				}
				else {
					it=it.getRight();
				}
			}
		}
	}
	
	public void printMin() {
		if(root == null) {
			System.out.println("Empty");
		}
		else {
			Node it =root;
			while(true) {
				if(it.getLeft() == null) {
					System.out.println("Min element is "+it.getData());
					break;
				}
				else {
					it=it.getLeft();
				}
			}
		}
	}

	public void deleteNode(int val) {
		Node it =root;
		del(it,val);
	}
	private Node del(Node it, int val) {
		
		if(it.getData()>val) {
			//go left
			it.setLeft(del(it.getLeft(),val));
		}
		else if(it.getData()<val) {
			//go right
			it.setRight(del(it.getRight(),val));
		}
		else if(it.getData() == val) {
			if(it.getLeft() != null && it.getRight() != null) {
				//node to be deleted has node on both side
				
				Node maxOfLeft = maxElement(it.getLeft());
				//taking greatest node on left of node to be deleted 
				
				int itData =it.getData();
				it.setData(maxOfLeft.getData());
				maxOfLeft.setData(itData);
				
				Node tem =del(it.getLeft(),maxOfLeft.getData());
				return tem;
			}
			else if(it.getLeft() == null) {
				//left is null return right
				return it.getRight();
			}
			else if(it.getRight() == null) {
				//right is null return left
				return it.getLeft();
			}
		}
		return it;
	}
	private Node maxElement(Node it) {
		Node tmp =null;
		while(true) {
			if(it.getRight() == null) {
				
				tmp = it;
				break;
			}
			else {
				it=it.getRight();
				
			}
		}
		return tmp;
	}
	
	
	
}
