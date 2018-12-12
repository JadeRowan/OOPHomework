package home;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void copyFile(File outFolder, File inFolder, File file) {
		
		try (FileInputStream fis = new FileInputStream(outFolder +"/"+file);
				FileOutputStream fos = new FileOutputStream(inFolder+"/"+file)) {
			byte[] bufer = new byte[1024];
			int byteread = 0;
			for (; (byteread = fis.read(bufer)) > 0;) {
				fos.write(bufer, 0, byteread);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
