class M2 
{
	public static void main(String[] args) 
	{
		Object o1 = new Object();
		Object o2 = o1;
		o1 = o2;
		
		C c1 = new C();
		C c2 = c1;
		c1 = c2;
		c2 = c1;
		
		System.out.println("done");
	}
}
//no casting allow b/c left and right side data type is same
//compilation and running both are success