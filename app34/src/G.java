class G 
{
	int i;//this i is global
		G(int i)
		{
			//i = i;//there is a local
			this.i = i;
		}
	public static void main(String[] args) 
	{
		G g1 = new G(200);
		System.out.println(g1.i);
	}
}
//0
//if we use this .i  = i then it use local then it print 200
//if we use i = i then we use global directly then it print 0