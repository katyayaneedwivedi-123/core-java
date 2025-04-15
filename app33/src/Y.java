class Y 
{
	int i;
	static Y test1()
	{
		Y obj = new Y();
	System.out.println("test1:" + obj.i); 
	obj.i = 20;
	System.out.println("test1:" + obj.i); 
	return obj;
	}
	static Y test2()
	{
		Y obj = new Y();
	System.out.println("test2:" + obj.i); 
	obj.i = 40;
	System.out.println("test2:" + obj.i); 
	return obj;
	}
	public static void main(String[] args)
	{
		Y obj1 = test1();
		System.out.println(obj1.i);
		System.out.println("------------");
		Y obj2 = test2();
		System.out.println(obj2.i);
	}
}
/*
test1:0
test1:20
20
------------------
test2:0
test2:40
40
*/