package app58;
class C{
	Double test()
	{
		return 3.4;
	}
}
public class M3 {
	public static void main(String[] args) {
		C c1 = new C();
		Double d1 = c1.test();
		
		C c2 = new C();
		Double d2 = c2.test();
		
		C c3 = new C();
		Double d3 = c3.test();
		
		C c4 = new C();
		Double d4 = c4.test();
		
		System.out.println("done");
		
	}
}
//test data type is fixed it not change for every object