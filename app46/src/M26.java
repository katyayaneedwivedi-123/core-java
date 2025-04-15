/*class M26 
{
	public static void main(String[] args) 
	{
		A a1 = new B();
		System.out.println(a1.i);
		//System.out.println(a1.j);
		a1.test1();
		//a1.test2();
	}
}*/
/*
while compiling compiler check what is a1
a1.j and test2 also not available in this 
while accessing any member tgrough reference compiler check type of the reference variable
*/



class M26 
{
	public static void main(String[] args) 
	{
		A a1 = new B();
		System.out.println(a1.i);
		//System.out.println(a1.j);
		a1.test1();
		//a1.test2();
	}

	public void test(B b1)
	{
	}
}
//Acontain only a not b object