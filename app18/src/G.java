class G 
{
	public static void main(String[] args) 
	{
		byte b1 = 10;//it is a byte every value should be in a byte range
		switch(b1)
		{
			case 5:
				System.out.println("from cases5");
				break;
			case 10:
				System.out.println("from cases10");
				break;
			case 140:
				System.out.println("from cases140");
				break;
		}
		System.out.println("end");
		
	}
}
// compilation error
