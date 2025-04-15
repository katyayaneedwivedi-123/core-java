package app82;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class M10 {
	public static void main(String[] args) {
		try(FileWriter out = new FileWriter("test10.txt", true);
			BufferedWriter bout = new BufferedWriter(out)){
			bout.write("hello to everone");//write the string into the internal buffer
			bout.newLine();//it provide the new line
			bout.write("hello to everone");
			bout.write("hello to everone");
			bout.write("hello to everone");
			bout.newLine();
			bout.write("hello to everone");
			bout.write("hello to everone");
			bout.newLine();
			bout.write("hello to everone");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
//Wraps the FileWriter with a BufferedWriter to enable buffering for more efficient file writing
//in buffer writer data is written in the internal memory buffer instead of direct to the file
//when buffer is full the entire buffer is write to the file in one operation 
//BufferWriter is on the top of file writer
//all writer and readers are a closable type
//don't use file writer alone use with the BufferWriter