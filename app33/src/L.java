class L 
{
	int i;
	
	public static void main(String[] args) 
	{
		L obj1 = new L();
		System.out.println(obj1.i);
		obj1.i = 20;
		System.out.println(obj1.i);
		L obj2 = new L();
		System.out.println(obj2.i);
		obj2.i = 120;
		System.out.println(obj2.i);
		L obj3 = new L();
		System.out.println(obj3.i);
		obj3.i = 220;
		System.out.println(obj3.i);
		System.out.println(obj2.i);
		System.out.println(obj1.i);
		obj1.i = 500;
		System.out.println(obj3.i);
		System.out.println(obj2.i);
		System.out.println(obj1.i);
	}
}
//i is not change only obj is change