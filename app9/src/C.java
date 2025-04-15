class C 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(202));
		System.out.println(Integer.parseInt("11001010" , 2));
	}
}

/*
decimal to binary

	202/2=101+0
	101/2=50+1
	50/2=25+0
	25/2=12+1
	12/2=6+0
	6/2=3+0
	3/2=1+1
	1/2=0+1
	--------------------------
			11001010
			
binary to decimal

	2^0*0=0
	2^1*1=2
	2^2*0=0
	2^3*1=8
	2^4*0=0
	2^5*0=0
	2^6*1=64
	2^7*1=128
	----------------------------------
			202
			
*/