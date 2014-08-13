package Chess;

import java.util.LinkedList;

public class Rook extends ChessPiece {

	
	public Rook(int xCoord, char yCoord) {

		position = new ChessPosition(xCoord, yCoord);
		allPositions = new LinkedList<ChessPosition>();
	}

	@Override
	public ChessPosition getPosition() {
		// this.position.setxCoord(8-this.position.getxCoord());
		return this.position;
	}

	@Override
	public LinkedList<ChessPosition> allowedMoves() {
		ChessPosition currentPosition;
		for (int i = 1; i < RANGE_OF_BOARD + 1; i++) {
			currentPosition = new ChessPosition(i, this.position.getyCoord());
			allPositions.add(currentPosition);
			currentPosition = new ChessPosition(this.position.getxCoord(),
					letter[i]);
			allPositions.add(currentPosition);
		}
		return allPositions;
	}

	public void outCollection() {
		for (int i = 0; i < allPositions.size(); i++) {
			System.out.print(allPositions.get(i).getxCoord() + " "
					+ allPositions.get(i).getyCoord() + "; ");
		}
		System.out.println();
	}

	@Override
	public boolean captures(ChessPosition pos) {
		for (int i = 0; i < allPositions.size(); i++) {
			if (allPositions.get(i).getxCoord() == pos.getxCoord()
					&& allPositions.get(i).getyCoord() == pos.getyCoord()) {
				return true;
			}
		}
		return false;
	}

}
