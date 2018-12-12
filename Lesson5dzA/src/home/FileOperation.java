package home;

import java.io.*;

public class FileOperation {
	public static void fileOperation(String [] ext, File outFolder, File inFolder) {
		PrintWriter pw = new PrintWriter(System.out, true);
		File file1 = new File("a.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			pw.println("ERROR!");
		}
		File folder = new File("A");
		folder.mkdirs();
		file1.renameTo(new File("b.txt"));
		File file2 = new File("b.txt");
		file2.delete();
		File f1 = new File(".");
		if (f1.isDirectory()) {
			String[] filenames = f1.list();
			for (String filename : filenames) {
				pw.println(filename);
			}
		}
	}
}
