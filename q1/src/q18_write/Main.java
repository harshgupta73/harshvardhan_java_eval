package q18_write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		
		try {
			File file = new File("filedemo.txt");
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write("hello harsh here");
			System.out.println("data added");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
}
