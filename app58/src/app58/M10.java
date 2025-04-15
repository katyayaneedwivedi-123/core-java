package app58;

class O < A > {//it generic for any type of the class
	A attr1;
}//it is 100% generic

class P < B extends Number > {//it is generic only for the number of the class
	B attr1;
}//it is generic only number or subclass number it don't accept other than number

public class M10 {
	public static void main(String[] args) {
		O<String> o1 = new O<String>();
		o1.attr1 = "abc";
		
		O<Integer> o2 = new O<Integer>();
		o2.attr1 = 23;
		
//		P<String> p1 = new P<String>();
//		p1.attr1 = "abc";
		
		P<Byte> p1 = new P<Byte>();
		p1.attr1 = 67;
		
		P<Integer> p2 = new P<Integer>();
		p2.attr1 = 23;
		
		P<Double> p3 = new P<Double>();
		p3.attr1 = 2.3;
		
		System.out.println("done");
		
	}
}
//class B extends only number so it take only number or subnumber
//but the generic extends the any type of the data