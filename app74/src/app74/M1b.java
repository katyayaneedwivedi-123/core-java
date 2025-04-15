package app74;

import java.util.List;

class ArrayList2 {
	private Object[] elements;
	private int size;
	
	public ArrayList2() {
		elements = new Object[10];
		size = 0;
	}
	public void add(Object obj) {
		if(size == elements.length) {
			Object[]  resize = new Object[elements.length * 2];
			elements = resize;
		}
		elements[size++] = obj;
	}
	
	public int size() {
		return size;
	}
	@Override
	public String toString() {
		String s = new String("[");
		for(int i = 0; i < size; i++) {
			s += elements[i];
			if(i < size-1) {
				s += ", ";
			}
		}
		s += "]";
		return s.toString();
	}
}
public class M1b {
	public static void main(String[] args) {
		ArrayList2 list = new ArrayList2();
		list.add("abc");
		list.add(true);
		list.add(0.5);
		list.add(34);
		list.add('a');
		System.out.println(list.size());
		System.out.println(list);
	}
}
