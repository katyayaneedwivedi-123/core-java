package app81;

import java.io.File;

public class M17 {
	public static void main(String[] args) {
		File src = new File("D:\\forjavaprogram");
		File[] members = src.listFiles();
		int dircount = 0, filecount = 0;
		for(File member : members) {
			if(member.isFile()) {
				filecount++;
			}
			else {
				dircount++;
			}
		}
		System.out.println("file count:" + filecount);
		System.out.println("dir count:" + dircount);
	}
}
