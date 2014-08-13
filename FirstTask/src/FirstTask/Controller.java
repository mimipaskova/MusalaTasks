package FirstTask;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Controller {
	
	InputParameters input;
	
	public Controller(InputParameters input) {
		this.input = input;		
	}
	
	public void controller() throws IOException {		

		String[] fileExt = InputParameters.splitExpr(input.getFileExtensions());
		File folder = new File(input.getNameDirectory());

		// Filtering Files by file Extension
		FilterSearchFiles searcher = new FilterSearchFiles();
		List<File> files = new ArrayList<File>();
		files = searcher.listFilesWithExtension(folder, fileExt);
		// Writing in File
		searcher.writeFromEveryFile(input.getExpression(), files);
	}

}
