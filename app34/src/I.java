class I 
{
	String s1;
	boolean b1;
	I(String s1, boolean b1)
	{
		this.s1 = s1;
		this.b1 = b1;
	}
	public static void main(String[] args) 
	{
		I obj = new I("abc", true);
		System.out.println(obj.s1);
		System.out.println(obj.b1);
	}
}
