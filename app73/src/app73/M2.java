package app73;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class B implements Comparable<B>{
	int i;
	B(int i){
		this.i = i;
	}
	@Override
	public String toString() {
		return "(" + i + ")";
	}
	@Override
	public int compareTo(B o) {
		return i - o.i;//this is a contract b/w the developer and collection api
	}
}
public class M2 {
	public static void main(String[] args) {
		List<B> list = new ArrayList<B>();
		list.add(new B(90));
		list.add(new B(190));
		list.add(new B(910));
		list.add(new B(909));
		list.add(new B(990));
		list.add(new B(40));
		list.add(new B(670));
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}
}
//it follow all the condition of sorting 
//we use user define data type means class name 
//element is comparable type we override this use of the compareTo method