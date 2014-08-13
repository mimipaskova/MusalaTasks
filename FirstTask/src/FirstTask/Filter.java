package FirstTask;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Filter {
	public List<File> listFilesWithExtension(File folder, String[] fileExt);

	public void writeFromEveryFile(String expression, List<File> files)
			throws IOException ;

}
