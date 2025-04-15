class V 
{
	V()
	{
		System.out.println(1);
	}
	{
		System.out.println(2);//it make iib b/c of {} 
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		V v1 = new V();
		System.out.println("----------");
		V v2 = new V();
		System.out.println("main end");
	}
}
/*
main begin
2
1
----------
2
1
main end
*/