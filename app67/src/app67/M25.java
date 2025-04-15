package app67;

import java.util.ArrayList;
import java.util.Iterator;

public class M25 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add(190);
		list.add(910);
		list.add(901);
		list.add(920);
		list.add(390);
		list.add(904);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
//Iterator is available in java.util.package
//it is a interface
//iterator is use in reading element one by one