package other;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;

@SuppressWarnings ("all")

public class fileWriter {

	public static void main(String[] args) {

		File newFile = new File("D:/writenfile.txt");
		if (newFile.exists()) 
			System.out.println("���� ����!");
		else {
			try {
				
				newFile.createNewFile();
				
				FileWriter fileW = new FileWriter(newFile);
				
				BufferedWriter buffW = new BufferedWriter(fileW);
				buffW.write("���� ����������� � ����!");
				buffW.close();
				
				System.out.println("����� ����������!");
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		
	}

}
