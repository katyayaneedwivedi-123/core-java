class F 
{
	public static void main(String[] args) 
	{
		System.out.println(342 | 191);
		System.out.println(342 & 191);
		System.out.println(342 ^ 191);
	}
}

/*
	for bitwise or(|)
		342	==>	101010110
		191	==>	010111111
		-------------------
				111111111	==>	511
				
	for bitwise and(&)
		342	==>	101010110
		191	==>	010111111
		-------------------
				000010110	==>	22
				
	for bitwise xor(^)
		342	==>	101010110
		191	==>	010111111
		-------------------
				111101001	==>	489
				
*/