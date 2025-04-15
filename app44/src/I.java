class A
{
	void test()
	{
		System.out.println("A-test");
	}
}
class I extends A 
{
	/*void test()//A class test method both are having same signature 
	//to class I method so super class method override with sub class method
	{
		System.out.println("I-test");
	}*/
	public static void main(String[] args) 
	{
		I obj = new I();
		obj.test();
		System.out.println("done");
	}
}
/*
I-test//both signature are same so method take a new value
done
*/
//if i give the comment to 10 to 14 line the 
/*
A-test
done
*/