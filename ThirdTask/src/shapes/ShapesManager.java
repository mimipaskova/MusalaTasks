package shapes;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapesManager {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
	
		Shape triangle = new Triangle(2, 3, 4, 5);
		Shape circle = new Circle(5);
		Shape circle1 = new Circle(5);
		Shape circle3 = new Circle(5);
		Shape rectangle = new Rectangle(6, 8);
		Shape rhombus = new Rhombus(5, 8);
		Shape rectangle1 = new Rectangle(6, 8);
		ArrayList<Shape> myShapes = new ArrayList<Shape>(Arrays.asList(triangle, circle,circle1, rectangle1, rectangle,new Rhombus(5, 8)));
		//Shape circle1 = new Circle(5);

		ComplexShape complex = new ComplexShape(myShapes);
		myShapes.add(complex);
		System.out.println("number of all shapes is " + complex.getNumberOfFigure());
		System.out.println(complex.getTitle() );
		//Shape comlpex1 = new ComplexShape(myShapes);
		//myShapes.add(comlpex1);
		//ShapesHelper.printShapes(myShapes);
		
		Polygon poly = new Polygon();
		Angle a1 = poly.createAngle();
		Angle a2 = poly.createAngle();
		// Angle a3 = poly.createAngle();
		// Angle a4 = poly.createAngle();
		// Angle a5 = poly.createAngle();
		// Angle a6 = poly.createAngle();

		System.out.println("All angles are " + poly.allAngles());

		ShapesHelper.printShapes(myShapes);
	}
}
