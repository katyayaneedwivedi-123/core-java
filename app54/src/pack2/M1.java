package pack2;

import java.io.Closeable;
import java.io.IOException;

class A implements Closeable{
	@Override
	public void close() throws IOException {
		System.out.println("from close");
		
	}
}
public class M1 {
	public static void main(String[] args) {
		try(A a1 = new A()){
			System.out.println("try");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("finally");
		}
		System.out.println("done");
	}
}
//closable is 