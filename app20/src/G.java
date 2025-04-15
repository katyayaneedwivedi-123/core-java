import java.io.*;

class G
{
	public static void main(String[] args) throws Exception
	{
		FileReader f1 = new FileReader("G.java");
		BufferedReader b1 = new BufferedReader(f1);
		String s1 = b1.readLine();//calling method
		while(s1 != null)
		{
			System.out.println(s1);
			s1 = b1.readLine();//if s1 is available then s1 is not a content
		}
		System.out.println("end of the program");
	}
}
//7and8 is built-in lines 
//G.java isa source file