package app55;

class A {//this is a concrete class
	void test1() {
		System.out.println("A-test1");
	}
	void test2() {
		System.out.println("A-test2");
	}
}
public class M8 {
	public static void main(String[] args) {
		A a1 = new A();//object creation to class A
		a1.test1();
		a1.test2();
		
		A a2 = new A()//it is not ending with the ; so it not create the object
				{
		//it is a new class it have not name it is representing through super class name 	
				};//this is a no class this complete portion is called a anonymous class
				a2.test1();
				a2.test2();
				
				System.out.println("------------");
				
				A a3 = new A() 
				{
					void test1() {
						System.out.println("AIC-test1");
					}
				};//this hole is anonymous inner class
				//the test1 of the class A is got override in the anonymous of the subclass A
				
				a3.test1();//test1 is modify 
				a3.test2();//but test2 is not modify
				
				System.out.println("------------");
				
				A a4 = new A() 
				{
					void test2() {
						System.out.println("AIC-test2");
					}
				};//this whole is anonymous inner class
				//the test2 of the class A is got override in the anonymous of the subclass A
				
				a4.test1();//test1 is not modify 
				a4.test2();//but test2 is modify
				
				System.out.println("------------");
				
				A a5 = new A() 
				{
					void test1() {
						System.out.println("AIC-test1");
					}
					void test2() {
						System.out.println("AIC-test2");
					}
				};
				
				a5.test1();//test1 is modify 
				a5.test2();//but test2 is modify
				
				A a6 = new A() 
				{
					void test3() {
						
					}
				};//inside the anonymous inner class we can not call the new method of anonymous inner class from its outside
				
			//	a6.test3();//a6 is a class type reference it check in class A in this test3 is not available
				
				A a7 = new A()
						{
							void test3()
							{
								System.out.println("from test3");
							}
							void test1() 
							{//it override the test3
								System.out.println("test1 begin");
								test3();//we can inside the anonymous inner class call the test3 method
								System.out.println("test1 end");
							}
						};
				a7.test1();
				a7.test2();
				
	}
}
//new operator is design to the subclass not a class A sub class have no name 
//it representing through the superclass the hole portion is called a anonymous class
//a1 is pointing to object of A
//a2 is pointing to subclass A
//new operator is applying to subclass of A
//always anonymous class is representing to the superclass name 
//if the line number 17 is ending with the ; then it is not a anonymous class
//method is inherited to A it not modify
//whatever test1 is inherited to A same test1
//anonymous inner class can not develop the second object it create only one object
//b/c it have no name so it not create the second object to anonymous inner class
//anonymous class can not develop the constructor b/c it have no name constructor always a class name
//in anonymous inner class only iib is the option to initialize non static member while object is creating