package app67;

import java.util.Collections;
import java.util.LinkedList;

public class M22 {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(78);
		list.add("write something");
		list.add('d');
		list.add(9.9);
		list.add(true);
		System.out.println(list);
		System.out.println(list.contains("write something"));
		System.out.println(list.contains(45));
		System.out.println("--------------------");
//		Collections.sort(list);//it give class cast exception b/c the data type is not same for the sorting
//		System.out.println(list);
	}
}
