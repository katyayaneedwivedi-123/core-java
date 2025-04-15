package app82;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

public class M23 {
	public static void main(String[] args) {
		try(FileReader file = new FileReader("test.txt")){
			BufferedReader in = new BufferedReader(file);
			String s1;
			while((s1 = in.readLine()) != null) {
				System.out.println(s1);
				char[] charArray = s1.toCharArray();
				TreeSet<Character> lowercasechar = new TreeSet<Character>();
				int count = 0;
				for(char c : charArray) {
					if(Character.isLowerCase(c)) {
						lowercasechar.add(c);
						count++;
					}
				}
				System.out.println("lowercasechar = " + lowercasechar);
				System.out.println("count = " + count);
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
