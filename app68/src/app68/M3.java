package app68;

import java.util.LinkedList;

public class M3 {
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
		list.push(333);
		System.out.println(list);
		list.push(444);
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
		System.out.println(list.pop());
		System.out.println(list);
	}
}
//push method is used to push (insert the value) in the beginning
//pop method is pop in the beginning means read and remove the beginning