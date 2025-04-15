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
	public void test2()
	{
		System.out.println("test2");
	}
}
class N
{
	public static void main(String[] args)
	{
		B obj = new B();
		obj.test1();
		obj.test2();
		System.out.println("done");
	}
}
//compile successfully
/*
test1
test2
done
*/
//b/c all the abstract A is overrided in B