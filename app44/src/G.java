abstract class G 
{
	void test()
	{
	}
	
	abstract void test(int i);
	abstract void test(int i, int j);
	abstract void test(double i);
	abstract void test(boolean i);
	void test(String i)
	{
		
	}
}
// it compile successfully but not run
//in overloading method some method can be abstract
//abstract can not be significant while overloading a method
// all method can be abstract , non abstract , few abstract, few non abstract