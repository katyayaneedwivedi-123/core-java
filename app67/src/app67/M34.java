package app67;

import java.util.ArrayList;
import java.util.ListIterator;

public class M34 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(190);
		list.add(910);
		list.add(901);
		list.add(920);
		list.add(390);
		list.add(904);
		ListIterator it = list.listIterator();
		Object obj;
		while(it.hasNext()) {
			obj  = it.next();
			System.out.println(obj);
			if(obj.equals(390)) {
				it.set(99999);
			}
		}
		list.add(200);
		System.out.println(list);
	}
}
//inside a list iterator there is a set method
//set method is used to replace an existing element 