package pack2;

import pack2.Node;

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
			last = n1;
		}
		else {
			last.next = n1;
			last = n1;
		}
	}
	public void read() {
		if(first == null) {
			System.out.println("empty");
			return;
		}
		Node current = first;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
}
public class K15 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(100);
		list.add(1.3);
		list.add("abc");
		list.add('d');
		list.read();
	}
}
