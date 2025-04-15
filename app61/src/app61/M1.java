package app61;

class A {
	int i;
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
//		a1.clone();
	}
}
//clone not supported exception we get compile time error
//clone method is protected A class clone method used in A not M1
