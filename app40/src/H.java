class A
{
	private int i;
}
class H extends A 
{
	public static void main(String[] args) 
	{
		H h1 = new H();
		System.out.println(h1.i);
	}
}
//i is private so we cannot used private class member in another class
//compilation error