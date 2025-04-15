abstract class A//abstract class
{
	abstract void test1();//abstract method
	void test2()
	{
		System.out.println("A-test2");//concrete method
	}
}
class B extends A//abstract class
{
	void test1()
	{
		System.out.println("B-test1");//concrete method
	}
}


class D 
{
	public static void main(String[] args) 
	{
		B b1 = new B();//creating an object to B
		b1.test1();//overrided test1
		b1.test2();//inherited test2
		System.out.println("done");
	}
}
//we can not used test2 without creating a object to A
//abstract method replace A class to B in in overwrited 
//no abstract method in B class
//its a concrete method