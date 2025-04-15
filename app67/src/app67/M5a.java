package app67;

import java.util.ArrayList;

public class M5a {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10000);
		list.add("abc");
		list.add(8.7);
		list.add('e');
		list.add(false);
		System.out.println(list);
		list.remove("abc");//it remove the data type object
		System.out.println(list);
	}
}
//overloaded or multiple remove number remove the object (data type)