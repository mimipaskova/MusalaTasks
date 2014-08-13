package shapes;

public class Rhombus extends Shape{
	
	static int numberOfRhombus = 0;
	public float h;
	
	public Rhombus(float a, float h) {
		this.h = h;
		this.a = a;
		this.title = "Rhombus";
		numberOfRhombus++;
		
	}

	public int getNumberOfFigure() {
		return numberOfRhombus;
	}

	public static void setNumberOfRhombus(int numberOfRhombus) {
		Rhombus.numberOfRhombus = numberOfRhombus;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public float getSurfaceArea() {
		surface = a*h;
		return surface;
	}

	@Override
	public float getPerimeter() {
		perimeter = 4*a;
		return perimeter;
	}

}
