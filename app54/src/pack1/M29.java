package pack1;

public class M29 {
	public static void main(String[] args) {
		try {
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
			Class.forName("");
		}
		catch(ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
}
//inside a try there are several statements
//no need of multiple catches