import java.io.*;

class I
{
	public static void main(String[] args) throws Exception
	{
		if(args.length == 0)
		{
			System.out.println("supply file name to read");
			return;
		}
		FileReader f1 = new FileReader(args[0]);
		BufferedReader b1 = new BufferedReader(f1);
		String s1;
		while((s1 = b1.readLine()) != null)
		{
			System.out.println(s1);
		}
		System.out.println("end of the program");
	}
}