package app59;

class E {
	int i;
	int j;
	
	E(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof E)) {
			return false;
		}
		E ref = (E) obj;
		boolean flag = this.i == ref.i && this.j == ref.j;
		return flag;//this is a e1 and ref is a e3 we are downcasted to ref 
	}
//object class equals method args or parameter is also a object type
}
public class M5 {
	public static void main(String[] args) {
		E e1 = new E(10, 20);
		E e2 = new E(10, 20);
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals("abc"));
		System.out.println(e1.equals(10));
	}
}
//both are the i and j value same but we are getting false
//b/c both are the memory address location are different
//object class toString method and equals method not use directly
//we use through a override
//we are down casting to the equals method