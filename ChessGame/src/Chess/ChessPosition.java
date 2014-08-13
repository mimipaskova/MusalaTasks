package Chess;

public class ChessPosition {

	private int xCoord;
	private char yCoord;
	final int RANGE_OF_BOARD = 8;

	public ChessPosition(int xCoord, char yCoord) {
		this.xCoord = xCoord;
		this.yCoord = yCoord;
	}

	public int getxCoord() {
		return xCoord;
	}

	public void setxCoord(int xCoord) {
		this.xCoord = this.RANGE_OF_BOARD-xCoord;
	}

	public char getyCoord() {
		return yCoord;
	}

	public void setyCoord(char yCoord) {
		this.yCoord = yCoord;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ChessPosition) {
			if (this.getxCoord() == ((ChessPosition) obj).getxCoord()
					&& this.getyCoord() == ((ChessPosition) obj).getyCoord())
				return true;
		}
		return false;
	}

}
