package FirstTask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteResult {
	
	public static void writeInFile(String expression, File file) throws IOException{
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String nameFile =file.toString();
		
		String line = null;
		int numberOfLine = 1;
		String fileWrite = "writeFile.txt";
		PrintWriter writer = new PrintWriter(
				new FileWriter(fileWrite, true));
		writer.println(nameFile.substring(nameFile.lastIndexOf("\\") + 1));

		while ((line = reader.readLine()) != null) {

			if (line.contains(expression)) {
				writer.print(numberOfLine);
				writer.println(line);
			}
			numberOfLine++;
		}
		writer.close();
		reader.close();		
	}

}
