package shapes;

import java.util.ArrayList;

import FirstTask.ConsoleReader;

public class Polygon extends Shape{
	
	static int numberOfPolygon = 0;
	ArrayList<Angle> polygonAngles = new ArrayList<Angle>();

	public Polygon() {
		this.title = "Polygon";
	}

	@Override
	public int getNumberOfFigure() {
		return numberOfPolygon;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public float getSurfaceArea() {
		double area = 0;
		int j = allAngles() - 1;
		
		for (int i = 0; i < allAngles(); i++) {
			area += (polygonAngles.get(j).getxCoord()+ polygonAngles.get(i).getxCoord())*(polygonAngles.get(j).getyCoord()-polygonAngles.get(i).getyCoord());
			j = i;			
		}
		return (float)area/2;
	}

	@Override
	public float getPerimeter() {
		double dis = 0;
		for (int i = 0; i < polygonAngles.size()-1; i++) {
			dis += Math.sqrt(Math.pow((polygonAngles.get(i+1).getxCoord() - polygonAngles.get(i).getxCoord()),2)+ 
					Math.pow((polygonAngles.get(i+1).getyCoord() - polygonAngles.get(i).getyCoord()),2));			
		}
		
		int lastInd = polygonAngles.size() - 1;
		dis+= Math.sqrt(Math.pow((polygonAngles.get(0).getxCoord() - polygonAngles.get(lastInd).getxCoord()),2)+ 
				Math.pow((polygonAngles.get(0).getyCoord() - polygonAngles.get(lastInd).getyCoord()),2));
		return (float)dis;
	}
	
	public Angle createAngle() {

		ConsoleReader readCoordinates = new ConsoleReader();
		System.out.println("Enter x coordinate of angle");
		String x = readCoordinates.read();
		System.out.println("Enter y coordinate of angle");
		String y = readCoordinates.read();

		int xCoord = Integer.parseInt(x);
		int yCoord = Integer.parseInt(y);
		
		Angle a1 = new Angle(xCoord,yCoord);
		System.out.println("Angle " + Angle.getNumberOfAngles() + " with coordinates " + a1.getxCoord() + " and " + a1.getyCoord());
		polygonAngles.add(a1);
		return a1;
		
	}

//	public void addAngle(Angle newAngle) {
//		polygonAngles.add(newAngle);
//	}

	public ArrayList<Angle> getPolygonAngles() {
		return polygonAngles;
	}

	public int allAngles() {
		return Angle.getNumberOfAngles();
	}

}
