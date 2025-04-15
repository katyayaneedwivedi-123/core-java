interface A//A is super interface
{
	void test1();
	void test2();
}
class B implements A//B is subclass
{//implements represents the doted line b/w superinterface to subclass
	public void test1()
	{
		System.out.println("test1");
	}
}
class M
{
	public static void main(String[] args)
	{
		System.out.println("done");
	}
}
//B class having only one inheritance of abstract method but
//interface containing 2 abstract method
//both are availabe to B 
//b/w 2 only one is inherited but 2 is not inherited so is not declared 
//as classs
//so compilation erroor