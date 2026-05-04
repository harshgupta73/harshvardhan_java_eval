package q18_delete;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("filedemo.txt");
		if(file.delete()) {
			System.out.println("file deleted");
		}
	}
}
