package FirstTask;

import java.io.IOException;

public class Manage{
	
	Input reader;
	
	public Manage(Input reader) {
		this.reader = reader;
		
	}
	
	public void manage() throws IOException{
		
		InputParameters input = reader.readAllParameters();
		Controller controll = new Controller(input);
		controll.controller();
		
		//Input reader = new ConsoleReader();
		//InputParameters input = new InputParameters(reader.read(),reader.read(), reader.read());
		//input.controller();
	}


}
