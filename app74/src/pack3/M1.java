package pack3;

class Node{
	Object data;
	Node next;
	Node prev;
}
class LinkedList {
	Node first;
	Node last;
	
	public void add(Object obj) {
		Node n1 = new Node();
		n1.data = obj;
		if(first == null) {
			first = n1;
		}
		else {
			last.next = n1;
		}
		n1.prev = last;
		last = n1;
	}	
	public void read() {
		Node current = first;
		while(current != first) {
			System.out.println(current.data);
			current = current.next;
		}
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	public void readinReverse() {
		Node current = last;
		while(current != null) {
			System.out.println(current.data);
			current = current.prev;
		}//this is a reading in the reverse order
}
}
public class M1 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(100);
		list.add(1.3);
		list.add("abc");
		list.add('d');
		list.read();
		System.out.println("-------------");
		list.readinReverse();
	}
}
