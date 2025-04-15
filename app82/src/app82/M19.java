package app82;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class M19 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		try(FileReader fin = new FileReader("test6.txt")) {
			BufferedReader in = new BufferedReader(fin);
			String s1;
			while((s1 = in.readLine()) != null) {
				System.out.println(s1);
				list.add(s1);
				System.out.println(list);
			}
		}
		catch (IOException ex) {
			ex.printStackTrace();
		}
		System.out.println("----------------------------------");
		for(int i = list.size() - 1; i > 0; i--) {
			System.out.println(list);
		}
	}
}
