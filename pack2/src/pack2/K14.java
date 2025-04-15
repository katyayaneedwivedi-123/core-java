package pack2;
class ArrayList {
	private Object[] obj;
	private int size;
	int i;
	ArrayList() {
		obj = new Object[10];
		size = 0;
	}
	public void add(Object objs) {
		if(size == obj.length) {
			Object[] newresize = new Object[obj.length * 2];
			obj = newresize;
		}
		obj[size++] = objs;
	}
	@Override
	public String toString() {
		String s = new String();
		for(i = 0; i < size; i++) {
			s += obj[i];
			if(i < size-1) {
				s += ", ";
			}
		}
		return s.toString();
	}
	public int size() {
		return size;
	}
}
public class K14 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(90);
		list.add("abc");
		list.add('s');
		list.add(45.5);
		list.add(true);
		System.out.println(list);
		System.out.println(list.size());
	}
}
