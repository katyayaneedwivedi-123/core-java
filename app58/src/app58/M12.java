package app58;
class R < A >
{
	A m1;
}
public class M12 {
	public static void main(String[] args) {
		R<Integer> r1 = new R<>();
		r1.m1 = 12;
		
		R<String> r2 = new R<>();
		r2.m1 = "abc";
		
	}
}
//right hand side in <> is not require to give the data type