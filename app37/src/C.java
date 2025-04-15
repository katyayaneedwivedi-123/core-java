class C 
{
	static int count;
	
	C()
	{
	}
	
	C(int i)
	{
	}
	
	C(double i)
	{
	}
	
	{
		count++;
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		C c2 = new C(10);
		C c3 = new C();
		C c4 = new C(2.4);
		C c5 = new C();
		System.out.println(C.count);
	}
}
//5