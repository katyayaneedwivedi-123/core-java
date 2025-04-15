package app67;

import java.util.ArrayList;

public class M6 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10000);
		list.add("abc");
		list.add(8.7);
		list.add('e');
		list.add(false);
		System.out.println(list);
		list.clear();//remove every element
		System.out.println(list);
		System.out.println(list.isEmpty());//if the list is empty then it return true
	}
}
