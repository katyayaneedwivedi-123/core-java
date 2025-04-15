package app58;

class F < Test > {
	void m1(Test arg1) {
		System.out.println(arg1);
	}//this is a non static method
}
public class M6 {
	public static void main(String[] args) {
		F<String> f1 = new F<String> ();
		f1.m1("abc");
		
		F<Integer> f2 = new F<Integer> ();
		f2.m1(33);
		
		F<Double> f3 = new F<Double> ();
		f3.m1(3.5);
		
	}
}
//method argument data type is not fixed it is generic
//object to object data type can be changed 