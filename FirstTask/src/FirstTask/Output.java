package FirstTask;

import java.io.File;
import java.io.IOException;

public interface Output {

	void write(String expression, File file) throws IOException;

}
