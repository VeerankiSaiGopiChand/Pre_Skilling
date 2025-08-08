package FileIOCase;

import java.io.File;
import java.io.IOException;

public class FileCreation {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\Users\\gopic\\eclipse-workspace\\Wipro\\src\\FileIOCase\\test.txt");
			if (file.createNewFile())
				System.out.print("File Created: " + file.getName());
			else
				System.out.print("File already exists");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
