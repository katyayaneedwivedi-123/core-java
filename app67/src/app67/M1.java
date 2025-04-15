package app67;

import java.util.ArrayList;

public class M1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(10000);
		list.add("abc");
		list.add(8.7);
		list.add('e');
		list.add(false);
		System.out.println(list);
		double d1 = (Double) list.get(2);//down casting is required 
		//b/c without generic get method take the object type return type
		System.out.println(list.get(2));
	}
}
