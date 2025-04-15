class E 
{
	public static void main(String[] args) 
	{
		E e1 = new E();
		E e2 =  e1;
		E e3 =  e1;
		E e4 =  e2;
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
	}
}
/*
E@4517d9a3
E@4517d9a3
E@4517d9a3
E@4517d9a3
*/