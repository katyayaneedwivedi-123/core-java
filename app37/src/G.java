class G 
{
	void test1()
	{
		System.out.println("test1:" + this);//this is reference to g1
	}
	void test2()
	{
		System.out.println("test2:" + this);//this is reference to g1
	}
	
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println("main:" + g1);
		g1.test1();
		g1.test2();
	}
}
/*
main:G@4517d9a3
test1:G@4517d9a3
test2:G@4517d9a3
*/