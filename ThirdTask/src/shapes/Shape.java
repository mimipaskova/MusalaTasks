package shapes;

public abstract class Shape {

	protected float a, perimeter, surface;
	protected String title;
	
	public abstract int getNumberOfFigure() ;

	public abstract String getTitle();

	public abstract float getSurfaceArea();

	public abstract float getPerimeter();

}
