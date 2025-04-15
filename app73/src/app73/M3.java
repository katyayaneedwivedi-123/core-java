package app73;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class C implements Comparable<C>{
	int i, j;
	C(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ")";
	}
	@Override
	public int compareTo(C o) {
		//return i - o.i;//we use only one value at a time 
		return j - o.j;//means we use i or j only one at a time
	}
}
public class M3 {
	public static void main(String[] args) {
		List<C> list = new ArrayList<C>();
		list.add(new C(10, 20));
		list.add(new C(1, 200));
		list.add(new C(101, 2));
		list.add(new C(510, 205));
		list.add(new C(160, 620));
		list.add(new C(109, 290));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
//sorting based on i b/c we use i attribute in compare method
//if we want sorting do on the bases on j so we use j in return method