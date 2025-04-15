class G 
{
	G(int i, int j)
	{
		this(i, j, i);
		System.out.println("G(int, int)");
	}
	G(int i, int j, int k)
	{
		System.out.println("G(int, int, int)");
	}
	public static void main(String[] args) 
	{
		G g1 = new G(10, 20, 30);
		System.out.println("-----------------------------");
		G g2 = new G(10, 20);
		System.out.println("-----------------------------");
	}
}
/*
G(int, int, int)
------------------------
G(int, int, int)
G(int, int)
*/