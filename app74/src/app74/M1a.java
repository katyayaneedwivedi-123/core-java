package app74;
class ArrayList1{
	private Object[] elements;
	private int size;
	private int capacity;
	
	ArrayList1(){
		capacity = 10;
		elements = new Object[capacity];
	}
	
	public void add(Object obj) {
		if(size == capacity) {
			alterCapacity();
		}
		elements[size ++] = obj;
	}
	private void alterCapacity() {
		Object[] temp = elements;
		capacity = capacity * 2;
		elements = new Object[capacity];
		for(int i = 0; i < temp.length; i++) {
			elements[i] = temp[i];
		}
	}
	@Override
	public String toString() {
		String s1 = "[";
		for(int i = 0; i < size; i++) {
			s1 += elements[i] + ", ";
		}
		s1 = s1.substring(0, s1.length() -2);
		s1 += "]";
		return s1;
	}
	public int size() {
		return size; 
	}
}
public class M1a {
	public static void main(String[] args) {
		ArrayList1 list = new ArrayList1();
		list.add(90);
		list.add("abc");
		list.add(3.5);
		list.add(false);
		System.out.println(list);
		System.out.println(list.size());
	}
}
