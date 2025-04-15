package app74;


class ArrayList {
	private Object[] elements;
	int i;
	private int size;
	
	public ArrayList() {
		elements = new Object[10];
		size = 0;
	}
	public void add(Object objs) {
		if(size == elements.length) {
			Object[] newresize = new Object[elements.length * 2];
			elements = newresize;
		}
		elements[size++] = objs;	
	}
	public int size() {
		return size;
	}
	@Override
	public String toString() {
		String s1 = new String("[");
		for(int i = 0; i < size; i++) {
			s1 += elements[i];
			if(i < size-1) {
				s1 += ", ";
			}
		}
		s1 += "]";
		return s1.toString(); 
	}
	
}
public class M1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add(3.5);
		list.add(false);
		System.out.println(list);
		System.out.println(list.size());
	}
}
