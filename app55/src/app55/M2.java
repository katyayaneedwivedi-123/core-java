package app55;

public class M2 {
	void test1() {
		
	}
	
	static void test2() {
		
	}
	public static void main(String[] args) {
		//test1();//this line give compilation error
		test2();
		M2 obj = new M2();
		obj.test1();
		new M2().test1();
	}
}

//static member can use directly but non static member can not use directly
//we use non static member along with a reference variable
//static member use directly or along with the class name