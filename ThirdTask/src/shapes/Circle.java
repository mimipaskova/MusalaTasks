package shapes;

public class Circle extends Shape {
	
	static int numberOfCircle = 0;
	public float PI = (float) Math.PI;
	public float radius;
	
	public Circle(float radius) {
		numberOfCircle++;
		this.radius = radius;	
		this.title = "Circle";
	}

	public int getNumberOfFigure() {
		return numberOfCircle;
	}

	public static void setNumberOfCircle(int numberOfCircle) {
		Circle.numberOfCircle = numberOfCircle;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public float getSurfaceArea() {
		surface = (float) (PI*Math.pow(radius, 2));
		return surface;
	}

	@Override
	public float getPerimeter() {
		perimeter = 2*PI*radius;
		return perimeter;
	}

}
