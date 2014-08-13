package shapes;

public class Triangle extends Shape{
	
	static int numberOfTriangle = 0;
	public float b,c,h;
	
	public Triangle(float a, float b, float c, float h) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.h = h;
		this.title = "Triangle";
		numberOfTriangle++;
	}

	public int getNumberOfFigure() {
		return numberOfTriangle;
	}

	public static void setNumberOfTriangle(int numberOfTriangle) {
		Triangle.numberOfTriangle = numberOfTriangle;
	}

	@Override
	public String getTitle() {
		
		return title;
				//"The shape is " + this.getClass().getSimpleName();
	}

	@Override
	public float getSurfaceArea() {
		surface = a*h/2;
		return surface;
	}

	@Override
	public float getPerimeter() {
		perimeter = a+b+c;
		return perimeter;
	}

}
