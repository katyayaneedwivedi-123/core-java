package pack2;

import java.io.File;

public class K18 {
	        public static void main(String[] args) {
	                File f1 = new File("C:\\javadeveloper\\jdk-22_windows-x64_bin\\jdk-22.0.2", "dir4");
	                System.out.println("a:" + f1.exists());
	                System.out.println("b:" + f1.mkdir());
	                System.out.println("c:" + f1.exists());
	                System.out.println("done");
	        }
}
