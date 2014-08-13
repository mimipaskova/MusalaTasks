package FirstTask;

import java.util.Scanner;

public class ConsoleReader implements Input {

	String reader;

	public String read() {
		Scanner in = new Scanner(System.in);
		reader = in.nextLine();
		// in.close();
		return reader;
	}
	
	public InputParameters readAllParameters(){
		System.out.println("nameDirectory");
		String nameDirectory = read();
		System.out.println("fileExtensions");
		String fileExtensions = read();
		System.out.println("expression");
		String expression = read();
		InputParameters inputAllParameters = new InputParameters(nameDirectory, fileExtensions, expression);
		return inputAllParameters;
	}
}
