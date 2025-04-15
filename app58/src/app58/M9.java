package app58;
interface K <GEN>
{
	void test1(GEN arg);
}

class L implements K <String>
{
	public void test1(String arg)
	{
		System.out.println("L-test1");
	}
}

class M implements K <Integer>
{
	public void test1(Integer arg)
	{
		System.out.println("M-test1");
	}
}

class N <Test> implements K <Test>
{
	public void test1(Test arg) 
	{
		System.out.println("N-test1");
	}
}
public class M9 {
	public static void main(String[] args) {
		L obj1 = new L();
		obj1.test1("abc");
		
		M obj2 = new M();
		obj2.test1(34);
		
		N <Double> obj3 = new N<Double> ();
		obj3.test1(1.2);
		
		N <Boolean> obj4 = new N<Boolean> ();
		obj4.test1(false);
		
		N <String> obj5 = new N<String> ();
		obj5.test1("xyz");
		
	}
}
