package Chess;

import java.util.LinkedList;

public abstract class ChessPiece {

	final int RANGE_OF_BOARD = 8;
	char[] letter = new char[] { ' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
	
	ChessPosition position;
	LinkedList<ChessPosition> allPositions;

	public abstract ChessPosition getPosition();

	public void setPosition(ChessPosition position) {
		this.position = position;
	}

	public abstract LinkedList<ChessPosition> allowedMoves();

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof ChessPiece) {
			if (this.getPosition().equals(((ChessPiece) obj).getPosition()))
				return true;
		}
		return false;
	}

	public abstract boolean captures(ChessPosition pos);
	
	public abstract void outCollection();

}
