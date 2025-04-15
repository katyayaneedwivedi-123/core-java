abstract class B
{
	void test1()
	{
		int i = 45;//single statement method
	}
	void test2()
	{
		//no statement method
	}
	abstract void test3();// it is unimplemented or undefined method
}
// test1 and test2 both are concrete method
//eventhough test2 is not having any statement 
// test3 using only declaration not definition
//abstract class should be end with the ;
//it only compile not run 