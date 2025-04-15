package app55;

public class M3 {
	class A {//nonstatic inner class
		
	}
	
	static class B {//static inner class
		
	}
	
	public static void main(String[] args) {
		A a1;//we use any class anywhere if the uses is data type uses
		//so A is used only for the data type purpose
		B b1;
		
        // a1 = new A();//it give compilation error A class can not be used directly
		//A is nonstatic member of M3 we can not be use directly
		b1 = new B();
		
		M3 obj =  new M3();
		a1 = obj.new A();
		a1 = new M3().new A();
		
		b1 = new B();
		b1 = new M3.B();//object is creating to B not M3. M3 is refer to B 
		
		System.out.println("done");
		
	}
}
//class A can not use classM3 directly
//any type of class can be used anywhere if the uses of the data type uses
//class A is used for the a1 type data type 
//class B is used for the b1 data type
//line 17 is give a compilation error
//object creation should have a reference variable
//B class is only for the operator M3 is not 
//object is creating to B not M3 
//we are using M3 to refer B