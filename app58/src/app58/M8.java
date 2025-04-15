package app58;
interface H <DataType> {
	DataType test1();
	void test2(DataType t1);
	void test3(DataType d1, DataType d2);
}

class I implements H < String >{

	@Override
	public String test1() {
		System.out.println("test1");
		return "abc";
	}

	@Override
	public void test2(String t1) {
		System.out.println("test2:" + t1);	
	}

	@Override
	public void test3(String d1, String d2) {
		System.out.println("test3:" + d1 + ", " + d2);
		
	}
	
}

class J implements H <Integer>{

	@Override
	public Integer test1() {
		System.out.println("test1");
		return 23;
	}

	@Override
	public void test2(Integer t1) {
		System.out.println("test2:" + t1);
		
	}

	@Override
	public void test3(Integer d1, Integer d2) {
		System.out.println("test3:" + d1 + "," + d2);
		
	}
	
}
public class M8 {
	public static void main(String[] args) {
		I obj1 = new I();
		System.out.println(obj1.test1());
		obj1.test2("abc");
		obj1.test3("abc", "xyz");
		System.out.println("-------------");
		J obj2 = new J();
		System.out.println(obj2.test1());
		obj2.test2(12);
		obj2.test3(1, 45);
		System.out.println("-------------");
	}
}
//inside interface we can not use generic in attributes