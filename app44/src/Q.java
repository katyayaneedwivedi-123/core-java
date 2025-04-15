class A
{
	void test(int i, int j)
	{
		System.out.println("A-test");
	}
}
class Q extends A 
{
	void test(int p, int q)
	{
		super.test(p, q);
		System.out.println("Q-test begin");
		//super.test(p, q);//super as a reference variable not a caling statement
		//this is used for giving a call to refer variable so it use in 2 or 3 statement (line)
		System.out.println("Q-test end");
	}
	public static void main(String[] args) 
	{
		Q obj = new Q();
		obj.test(23, 40);
		System.out.println("done");
	}
}
/*
Q-test begin
A-test
Q-test end
done
*/
//if we give the first satement of super.test(p, q)
/*
A-test
Q-test begin
Q-test end
done
*/