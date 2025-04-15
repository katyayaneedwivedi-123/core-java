package app73;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class F{
	int i, j, k;
	F(int i, int j, int k){
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public String toString() {
		return "(" + i + ", " + j + ", " + k + ")";
	}
}
public class M6 {
	public static void main(String[] args) {
		List<F> list = new ArrayList<F>();
		list.add(new F(10, 20, 30));
		list.add(new F(20, 10, 30));
		list.add(new F(10, 30, 20));
		list.add(new F(30, 20, 10));
		list.add(new F(50, 40, 60));
		System.out.println(list);	
		list.sort(new Comparator<F>() {
			@Override
			public int compare(F o1, F o2) {
				return o1.i - o2.i;
			}
		});
		System.out.println(list);
		
		list.sort(new Comparator<F>() {
			@Override
			public int compare(F o1, F o2) {
				return o1.j - o2.j;
			}
		});
		System.out.println(list);
		
		list.sort(new Comparator<F>() {
			@Override
			public int compare(F o1, F o2) {
				return o1.k - o2.k;
			}
		});
		System.out.println(list);
	}
}
//we can direct use the comparator method without the make of another class
//we use direct in use the anonymous inner class 