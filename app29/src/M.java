class M
{
	static int i = j;//direct read
	static int j;// before notifing j is direct read in line no 3 
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
//compilation error