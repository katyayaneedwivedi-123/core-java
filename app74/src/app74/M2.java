package app74;
class Node{
	Object elements;
	Node next;
}
class Linkedlist{
	Node first;
	Node last;
	
	public void add(Object obj) {
		Node n1 = new Node();
		n1.elements = obj;
		if(first == null) {
			first = n1;
		}
		else {
			last.next = n1;
		}
		last = n1;
	}
	public void read() {
		Node current = first;
		while(current != null) {
			System.out.println(current.elements);
			current = current.next;
		}
	}
}
public class M2 {
	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list.add(100);
		list.add(1.3);
		list.add("abc");
		list.add('d');
		list.read();
		
	}
}
//this type of linked list is a singular linked list
//b/c it read in a single direction