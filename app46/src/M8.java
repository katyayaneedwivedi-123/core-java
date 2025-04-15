class M8 
{
	static A test1(C c1)
	{
		B b1 = c1;//B b1 = (B) c1;
		return b1;//return (A) b1;
	}
	public static void main(String[] args) 
	{
		Object o1 = test1(new D());//Object o1 = (Object) test1((C) new D());
		System.out.println("done");
	}
}
//compile successful