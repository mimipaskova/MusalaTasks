package FirstTask;

import java.io.IOException;

public class Manager {

	public static void main(String[] args) throws IOException {
		
		Input reader = new ConsoleReader();
		Manage man = new Manage(reader);
		man.manage();
		
		//Input reader = new ConsoleReader();
		//reader.manage();
	}

}
