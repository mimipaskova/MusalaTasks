package FirstTask;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilterSearchFiles implements Filter  {

	public List<File> listFilesWithExtension(File folder, String[] fileExt)
			 {
		List<File> files = new ArrayList<File>();
		//System.out.println(fileExt[0]);
		for (File fileEntry : folder.listFiles()) {
			for (int i = 0; i < fileExt.length; i++) {
				if (fileEntry.getName().endsWith(fileExt[i])) {
					files.add(fileEntry);
					
				}
			}
		}
		if (files.size() == 0) {
			for (File fileEntry : folder.listFiles()) {
				files.add(fileEntry);
			}
		}
		return files;
	}

	public void writeFromEveryFile(String expression, List<File> files)
			throws IOException {
		
		
		for (int file = 0; file < files.size(); file++) {
			File currentFile = files.get(file);
			FileWriteResult.writeInFile(expression, currentFile);;		
		}
	}	
}
