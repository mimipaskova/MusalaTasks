package shapes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class ComplexShape extends Shape {

	private ArrayList<Shape> allShapes;
	HashMap<String, Integer> map;
	

	public ComplexShape(ArrayList<Shape> allShapes) {

		this.allShapes = new ArrayList<Shape>(allShapes);
		this.map = convertToMap();
	
	}

	@Override
	public String getTitle() {
		
		title = map.toString();		
		title = title.replace("}", "");		
		title = title.replace("{", "");		
		title = title.replace("=", ": ");
		return title;
	}

	@Override
	public float getSurfaceArea() {
		int surface = 0;
		for (int i = 0; i < allShapes.size(); i++) {
			surface += allShapes.get(i).getSurfaceArea();
		}
		return surface;
	}

	@Override
	public float getPerimeter() {
		int perimeter = 0;
		for (int i = 0; i < allShapes.size(); i++) {
			perimeter += allShapes.get(i).getPerimeter();
		}
		return perimeter;
	}

	@Override
	public int getNumberOfFigure() {

		int number = 0;
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Integer> pairs = it.next();
			number += (Integer) pairs.getValue();
			//it.remove();
		}
		
		return number;
	}

	public HashMap<String, Integer> convertToMap() {
		this.map = new HashMap<String, Integer>();
		String key;
		for (int i = 0; i < allShapes.size(); i++) {
			map.put(allShapes.get(i).getTitle(), 0);
			key = allShapes.get(i).getTitle();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
//				System.out.println(key + " " + map.get(key));
			}

		}
		return map;
	}
	
	public String getTitleAllShapes() {
		String title = "";
		Set<String> numbers = new TreeSet<String>();
		for (int i = 0; i < allShapes.size(); i++) {
			System.out.println("adding value " + allShapes.get(i).getTitle());
			numbers.add(allShapes.get(i).getTitle() + " : "
					+ allShapes.get(i).getNumberOfFigure() + " ");
		}
		title = numbers.toString();
		title = title.replace("[", "");
		title = title.replace("]", "");
		return title;
	}

}
