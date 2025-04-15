package app74;
class Node4{
	Object elements;
	Node4 next;
}
class LinkedList1{
	Node4 first;
	Node4 last;
	
	public void add(Object obj) {
		Node4 n = new Node4();
		n.elements = obj;
		if(first == null) {
			first = n;
		}
		else {
			last.next = n;
		}
		last = n;
	}
	public void read() {
		Node4 current = first;
		while(current != null) {
			System.out.println(current.elements);
			current = current.next;
		}
	}
}
public class M2a {
	public static void main(String[] args) {
		LinkedList1 list = new LinkedList1();
		list.add("katyayanee");
		list.add(21);
		list.add(9.0);
		list.add(true);
		list.add('d');
		list.read();
	}
}
