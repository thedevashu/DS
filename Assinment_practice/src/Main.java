
public class Main {

	public static void main(String[] args) {
		LL list =new LL();
		LL list2 =new LL();
		list2.insert(12);
		list2.insert(14);
		list2.insert(15);
		list2.insert(0);
		list2.insert(1);
		System.out.println(list2);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(77);
		list.insert(4);
		list.insert(5);
//		list.insert(6);
//		list.insert(7);
//		list.insert(8);
//		list.insert(9);
//		System.out.println(list);
//		list.delOddNode();
//		System.out.println(list);
//		list.searchByData(3);
//		list.revPrint();
		
		list.sortLL();
		System.out.println(list);
		list.merg(list2);
		list.sortLL();
		System.out.println(list);
	}
}
