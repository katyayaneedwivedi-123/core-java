package app74;
class Node2{
	Object data;
	Node2 next;
	Node2 prev;
}
class DoubleLinkedlist{
	Node2 first;
	Node2 last;
	
	public void add(Object obj) {
		Node2 n1 = new Node2();
		n1.data = obj;
		if(first == null) {
			first = n1;
		}
		else {
			last.next = n1;
		}
		last = n1;
		n1.prev = last;
	}
	public void read() {
		Node2 current = first;
		do {
			System.out.println(current.data);
			current = current.next;
		}
		while(current != first);
		
		Node2 previous = last;
		do {
			System.out.println(previous.data);
			previous = previous.next;
		}
		while(previous != last);
	}
}
public class M4 {
	public static void main(String[] args) {
		DoubleLinkedlist list = new DoubleLinkedlist();
		list.add(100);
		list.add(1.3);
		list.add("abc");
		list.add('d');
		list.read();
		
	}
}