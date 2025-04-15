package pack2;

class Node{
	Object data;
	Node next;
	Node prev;
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
			last.next = n1;//for clockwise purpose
		}
		n1.prev = last;//for anti clockwise purpose
		last = n1;
	}
	public void read() {
		Node current = first;
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
//Double Linked List
//n1.prev = last; is very important it point to the previous = last 
//b/c double linked list is bidirectional so it have two directions
//last.next = n1; means it point to the next element 
//n1.previous = last; means it point to the previous last element