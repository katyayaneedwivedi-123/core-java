package app73;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class D {
	int i, j;
	D(int i, int j){
		this.i = i;
		this.j = j;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ")";
	}
}
class Sort1 implements Comparator<D> {
	@Override
	public int compare(D o1, D o2) {
		return o1.i - o2.i;
	}
}
class Sort2 implements Comparator<D> {
	@Override
	public int compare(D o1, D o2) {
		return o1.j - o2.j;
	}
}
public class M4 {
	public static void main(String[] args) {
		List<D> list = new ArrayList<D>();
		list.add(new D(10, 20));
		list.add(new D(1, 200));
		list.add(new D(101, 2));
		list.add(new D(510, 205));
		list.add(new D(160, 620));
		list.add(new D(109, 290));
		System.out.println(list);
		Collections.sort(list, new Sort1());//it is sorting based on i
		System.out.println(list);
		Collections.sort(list, new Sort2());//it is sorting based on j
		System.out.println(list);
	}
}
//comparator is a interface it is a single interface method
//in comparator we use more than 1 attribute at a time 
//for one attribute it make 1 class and second attribute it make another class 
//then it do sorting
//in Sort1 means sorting is based on i
//and Sort2 means sorting is based on j