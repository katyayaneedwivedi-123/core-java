class H 
{
	int i;
	int j;
	H(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	public static void main(String[] args) 
	{
		H h1 = new H(10, 20);
		System.out.println(h1.i);
		System.out.println(h1.j);
		System.out.println("-------------");
		H h2 = new H(210, 204);
		System.out.println(h2.i);
		System.out.println(h2.j);
		System.out.println("-------------");
	}
}
//global value is a part of object