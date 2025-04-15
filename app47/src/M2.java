class A
{
	void test()
	{
		System.out.println("A-test");
	}
}
class B extends A 
{
	void test()
	{
		System.out.println("B-test");
	}
}
class M2
{
	public static void main(String[] args) 
	{
		A a1 = new A();//a1 containing class A test method
		A a2 = new B();//object is creating in B class/a2 calling in class B test method
		A[] elements = {a1, a2};
		for(A element : elements)
		{
			element.test();//this line executed 2 time 1 for A
			//and second for B now it showing a polymorphism
		}
	}
}

//A class test method not available in the B class
//in polymorphise we use array
//array is contain a element a1 and a2