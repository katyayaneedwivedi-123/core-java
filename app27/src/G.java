interface A
{
}



class G 
{
	static A a1;
	static Runnable r1;
	static Comparable c1;
	public static void main(String[] args) 
	{
		System.out.println(a1);
		System.out.println(r1);
		System.out.println(c1);
		A a2 = null;
		System.out.println(a2);
	}
}
