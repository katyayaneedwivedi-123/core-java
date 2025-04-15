package pack1;

class Node{
	Object data;
	Node next;
}
class LinkedList{
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
		last = n1;
		last.next = first;
	}
	public void read() {
		Node current = first;
		if(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		if(current != null) {
			while(current != first) {
				System.out.println(current.data);
				current = current.next;
			}
		}
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
		
	}
}
//circular linked list