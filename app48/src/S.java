class S 
{
	final int i;
	
	S(int p)
	{
		i = 20;
	}
	S()
	{
		i = 400;
	}
	S(int x, int y)
	{
		i = 300;
	}
	public static void main(String[] args) 
	{
		S s1 = new S();
		S s2 = new S(10);
		S s3 = new S(1, 3);
		System.out.println("done");
	}
}
//for any object creation 2 constructors are not executing
//All 3 are different object in any of the object reinitialization 
//not allow only initialization allow
//it is nonstatic