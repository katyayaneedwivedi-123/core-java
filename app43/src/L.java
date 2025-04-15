interface A//A is super interface
{
	void test1();
}
class B implements A//B is subclass
{//implements represents the doted line b/w superinterface to subclass
	public void test1()
	{
		System.out.println("test1");
	}
}
class L
{
	public static void main(String[] args)
	{
		B b1 = new B();//local variable also a interface type
		b1.test1();
		System.out.println("done");
	}
}
/*
test1
done
*/
//interface A member inherite to B means we should override abstract method
//of superinterface to subclass
//while overide with the public b/c every interface method is public by 
//default overriding method of subclass you should override with public
//we can not create object to interface