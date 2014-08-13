package shapes;

public class Angle {
	
	static int numberOfAngle = 0;
	int xCoord, yCoord;
	
	public Angle( int xCoord, int yCoord) {
		numberOfAngle++;
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		//numberOfAngle= numberOfAngle+1;
	}
	
	public static int getNumberOfAngles() {
		return numberOfAngle;
	}

	public static void setNumberOfAngle(int numberOfAngle) {
		Angle.numberOfAngle = numberOfAngle;
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = xCoord;
	}

	public int getyCoord() {
		return yCoord;
	}

	public void setyCoord(int yCoord) {
		this.yCoord = yCoord;
	}	
	
}
