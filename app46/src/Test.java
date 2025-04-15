class Test 
{
	static void f1(Object obj)
	{
		System.out.println("f1 begin");	
		B b1 = (B) obj;
		System.out.println("f1 end");	
	}
	static void f2(Object obj)
	{
		System.out.println("f2 begin");	
		if(obj instanceof B)
		{
			B b1 = (B) obj;
			System.out.println("conerted into B");
		}
		System.out.println("f2 end");	
	}
}
