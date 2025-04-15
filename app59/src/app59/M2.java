package app59;
class B {
	int i;
	int j;
	public B(int i, int j) {
		super();
		this.i = i;//reference variable
		this.j = j;//reference variable
	}//in this constructor have no no argument super calling constructor generate so it we call through the super calling no argument
}
public class M2 {
	public static void main(String[] args) {
		B b1 = new B(10, 20);
		System.out.println(b1);
		B b2 = new B(110, 201);
		System.out.println(b2);
	}
}
