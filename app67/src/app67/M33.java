package app67;

import java.util.ArrayList;
import java.util.ListIterator;

public class M33 {
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
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		list.add(200);//we can do after iteration
		System.out.println(list);
	}
}
