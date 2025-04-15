class N
{
	static int i = 10, j, k = 40, m, n;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		System.out.println(n);
		i = j = n = 400;
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		System.out.println(n);
	}
}
