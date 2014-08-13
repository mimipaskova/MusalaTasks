package shapes;

import java.util.ArrayList;

public class ShapesHelper {
	
	public static Shape[] varArgsToArray(Shape... shape){
		return shape;	
	}
	
	public  static void printShapes(ArrayList<Shape> shape){
		
		for (int i = 0; i < shape.size(); i++) {
			System.out.print(shape.get(i).getTitle());
			System.out.print(" with surface " + shape.get(i).getSurfaceArea());
			System.out.println(" and perimeter " + shape.get(i).getPerimeter());
			
		}		
	}
	
	public static ArrayList<Shape> arrayToList(Shape[] shapes){
		ArrayList<Shape> allShapes = new ArrayList<Shape>();
		for (int i = 0; i < shapes.length; i++) {
			allShapes.add(shapes[i]);			
		}
		return allShapes;
	}
}
