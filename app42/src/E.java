abstract class A//abstract class
{
	abstract void test1();//abstract method
	void test2()
	{
		System.out.println("A-test2");//concrete method
	}
	abstract void test3();//abstract method
}
class B extends A
{
	void test1()
	{
		System.out.println("B-test1");//concrete method
	}
}


class E
{
	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}
//compilation error
//abstract method containing 2 abstract method b/c of it we declared a abstract
//both method abstract method inherited to B class so B overided both abstract method but B only overrided only test1 
//so B should declared as Abstract class but B is not declared as abstract class