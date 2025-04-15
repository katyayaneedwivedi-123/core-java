class A 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(48));
		System.out.println(Integer.parseInt("110000" , 2));//2is representing binary
	}
}
/*
	Decimal to binary
	
	48/2	=	24	+	0
	24/2	=	12	+	0
	12/2	=	6	+	0
	6/2		=	3	+	0
	3/2		=	1	+	1
	1/2		=	0	+	1
	==================================
						110000
						
	binary to decimal:
	------------------------
	110000(right to left) 
	
	2^0*0	=	0
	2^1*0	=	0
	2^2*0	=	0
	2^3*0	=	0
	2^4*1	=	16
	2^5*1	=	32
	=========================
				48(sum)
	
	
	
	
	
	
*/