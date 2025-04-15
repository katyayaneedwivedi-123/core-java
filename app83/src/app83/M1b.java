package app83;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class M1b {
	public static void main(String[] args) {
		File src = new File("E:\\Katyayanee Phone\\IMG-20230716-WA0031.jpg");
		File target = new File("pqr.jpg");
		try{
			FileInputStream file = new FileInputStream(src);
			BufferedInputStream bin = new BufferedInputStream(file);
			FileOutputStream fout = new FileOutputStream(target);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			int size = (int) src.length();
			byte[] bytes = new byte[size];
			bin.read(bytes);
			System.out.println("done");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
