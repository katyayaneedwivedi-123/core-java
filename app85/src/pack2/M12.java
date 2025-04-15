package pack2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class M12 {
		public static void main(String[] args) throws IOException{
			File f1 = new File("D:\\forjavaprogram");
			Stream<Path> files = Files.walk(f1.toPath());//it call the toPath method it supply to the list
			files.forEach(c1 -> System.out.println(c1.getFileName()));//every element we are getting use of the getFileName method
		}
}
//walk method walking through all the directory including all the subdirectory