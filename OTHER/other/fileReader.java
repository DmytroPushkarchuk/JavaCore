package other;

import java.io.BufferedReader;
import java.io.FileReader;

@SuppressWarnings ("all")

public class fileReader {

	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader("D:/readme.txt");
		BufferedReader reader = new BufferedReader(file);
		
		String text = "";
		String line = reader.readLine();
		
		while (line!=null) {
			text += line + "\n";
			line = reader.readLine();
		}
		
		System.out.println(text);

	}

}
