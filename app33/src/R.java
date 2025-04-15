class R 
{
	int i;
	public static void main(String[] args) 
	{
		R r1 = null;
		System.out.println(r1.i);//r1 not find object b/c of null
		r1.i = 400;
		System.out.println(r1.i);
	}
}
//all one initialized a value so compilation very success
//null is nothing if we assigning a null then nothing
//null pointer exception(line7)