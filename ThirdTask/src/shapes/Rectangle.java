package shapes;

public class Rectangle extends Shape {
	
	static int numberOfRectangle = 0;
	public float b;
	
	public Rectangle(float a, float b) {
		this.a = a;
		this.b = b;
		this.title = "Rectangle";
		numberOfRectangle++;
	}

	public int getNumberOfFigure() {
		return numberOfRectangle;
	}

	public static void setNumberOfRectangle(int numberOfRectangle) {
		Rectangle.numberOfRectangle = numberOfRectangle;
	}

	@Override
	public String getTitle() {
		
		return title;
				//"The shape is " + this.getClass().getSimpleName();
	}

	@Override
	public float getSurfaceArea() {
		surface = a*b;
		return surface;
	}

	@Override
	public float getPerimeter() {
		perimeter = 2*(a+b);
		return perimeter;
	}

}
