package q18_create;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		File file= new File("filedemo.txt");
		try {
			file.createNewFile();
			System.out.println("file created");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
