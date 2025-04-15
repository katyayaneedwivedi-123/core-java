class B 
{
	static int count;
	
	B()
	{
		count++;
	}
	
	B(int i)
	{
		count++;
	}
	
	B(double j)
	{
		count++;
	}
	
	public static void main(String[] args) 
	{
		B b1 = new B();
		B b2 = new B(10);
		B b3 = new B();
		B b4 = new B(2.5);
		B b5 = new B();
		System.out.println(B.count);
	}
}
/*
5
*/