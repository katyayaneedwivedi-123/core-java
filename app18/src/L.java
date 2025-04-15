class L 
{
	enum Day {MON, TUE, WED, THR, FRI, SAT, SUN}
	public static void main(String[] args) 
	{
		switch(Day.WED)
		{
			case MON:
				System.out.println("case MON");
				break;
			case TUE:
				System.out.println("case TUE");
				break;
			case SAT:
				System.out.println("case SAT");
				break;
			case WED:
				System.out.println("case WED");//case WED
				break;
		}
	}
}
//without break it gives compilation error