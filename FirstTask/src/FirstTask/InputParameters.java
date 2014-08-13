package FirstTask;

public class InputParameters {
	private String nameDirectory;
	private String fileExtensions;
	private String expression;

	public InputParameters() {
	}

	public InputParameters(String nameDirectory, String fileExtensions,
			String expression) {
		this.nameDirectory = nameDirectory;
		this.fileExtensions = fileExtensions;
		this.expression = expression;
	}

	public static String[] splitExpr(String fileExtensions) {
		String[] fileExt;
		fileExt = fileExtensions.split(" ");
		return fileExt;
	}

	public String getNameDirectory() {
		return nameDirectory;
	}

	public void setNameDirectory(String nameDirectory) {
		this.nameDirectory = nameDirectory;
	}

	public String getFileExtensions() {
		return fileExtensions;
	}

	public void setFileExtensions(String fileExtensions) {
		this.fileExtensions = fileExtensions;
	}

	public String getExpression() {
		return expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

}
