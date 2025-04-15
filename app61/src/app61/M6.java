package app61;
class E implements Cloneable{
	int i;
	
	void test() throws CloneNotSupportedException {
		E obj = (E) clone();
		System.out.println("cloned object:" + obj.i);
	}
}
public class M6 {
	public static void main(String[] args) throws CloneNotSupportedException{
		E e1 = new E();
		e1.i = 20;
		System.out.println("main:" + e1.i);
		e1.test();
	}
}
