 package app68;

import java.util.LinkedList;

public class M1 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1000);
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(5000);
		list.add(6000);
		list.add(7000);
		list.add(8000);
		list.add(9000);
		System.out.println(list);
		System.out.println(list.peek());
		System.out.println(list);
		System.out.println(list.peekFirst());
		System.out.println(list);
		System.out.println(list.peekLast());
		System.out.println(list);
	}
}
//peek and peekFirst both are same 
//peek is using for reading the element not for removing
//peekLast read the last element 