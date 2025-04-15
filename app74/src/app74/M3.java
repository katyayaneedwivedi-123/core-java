package app74;
class Node1{
	Object elements;
	Node next;
}
class CircularLinkedlist{
	Node first;
	Node last;
	
	public void add(Object obj) {
		Node n1 = new Node();
		n1.elements = obj;
		if(first == null) {
			first = n1;
			n1.next = first;
		}
		else {
			last.next = n1;
			n1.next = first;
		}
		last = n1;
	}
	public void read() {
		Node current = first;
		do {
			System.out.println(current.elements);
			current = current.next;
		}
		while(current != first);
		
		Node previous = last;
		do {
			System.out.println(previous.elements);
			previous = previous.next;
		}
		while(previous != last);
	}
}
public class M3 {
	public static void main(String[] args) {
		CircularLinkedlist list = new CircularLinkedlist();
		list.add(100);
		list.add(1.3);
		list.add("abc");
		list.add('d');
		list.read();
		
	}
}
