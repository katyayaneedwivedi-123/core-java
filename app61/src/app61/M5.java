package app61;
class E1 {
	int i;
	
	void test() throws CloneNotSupportedException {
		D obj = (D) clone();
		System.out.println("cloned object:" + obj.i);
	}
}
public class M5 {
	public static void main(String[] args) throws CloneNotSupportedException{
		D d1 = new D();
		d1.i = 20;
		System.out.println("main:" + d1.i);
		d1.test();
	}
}
//it give run time exception
//by default is not eligible 
//we can not use clone without the implementing the cloneable