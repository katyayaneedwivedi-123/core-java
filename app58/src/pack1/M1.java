package pack1;
class A < Z > {
	Z f1;
}
public class M1 {
	public static void main(String[] args) {
		A< ? > a1 = null;
		a1 = new A<Integer>();
		a1 = new A<String>();
		a1 = new A<Double>();
		a1 = new A<Boolean>();
		a1 = new A<Number>();
		a1 = new A<System>();
		a1 = new A<Math>();
		a1 = new A<M1>();
		
		A < ? extends Number > a2 = null;
		a2 = new A<Integer>();
//		a2 = new A<String>();
		a2 = new A<Double>();
//		a2 = new A<Boolean>();
		a2 = new A<Number>();
//		a2 = new A<System>();
//		a2 = new A<Math>();
//		a2 = new A<M1>();
		
		A < ? super Number > a3 = null;
//		a3 = new A<Integer>();
//	    a3 = new A<String>();
//		a3 = new A<Double>();
//		a3 = new A<Boolean>();
		a3 = new A<Number>();
//		a3 = new A<System>();
//		a3 = new A<Math>();
//		a3 = new A<M1>();	
		a3 = new A<Object>();
		
	}
}
//in wild card any number of and data type of statement allow
// ? is a wild card 
//wild card extends number so it take only number or subclass of number
//for a reference variable we can use the wild card
//compiler is know the object is choosing by any generic
//a2 means number or subclass to number
//a3 means number or superclass to number