package app67;

import java.util.ArrayList;
import java.util.ListIterator;

public class M32 {
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
		list.add(200);//b/c of it we give exception
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
//list iterator also fail pass 
//ConcurrentModificationException