package Chess;

import java.util.LinkedList;

public class Knight extends ChessPiece{
	
	public Knight(int xCoord, char yCoord) {

		position = new ChessPosition(xCoord, yCoord);
		allPositions = new LinkedList<ChessPosition>();
	}

	@Override
	public ChessPosition getPosition() {

		return this.position;
	}

	@Override
	public LinkedList<ChessPosition> allowedMoves() {
		ChessPosition currentPosition;

		// 1 and 2
		if(this.position.getxCoord()-2 >= 0){
			if(this.position.getyCoord()-1 >= 'A'){				
				currentPosition = new ChessPosition(this.position.getxCoord()-2, (char) (this.position.getyCoord()-1));
				allPositions.add(currentPosition);
			}
			if(this.position.getyCoord()+1 >= 0 && this.position.getyCoord()+1 <= this.letter[this.RANGE_OF_BOARD]){
				currentPosition = new ChessPosition(this.position.getxCoord()-2,(char) (this.position.getyCoord()+1));
				allPositions.add(currentPosition);
			}
		}
		
		//3 and 4
		if(this.position.getxCoord() - 1 >0){
			
			if(this.position.getyCoord()-2 >= 'A'){				
				currentPosition = new ChessPosition(this.position.getxCoord()-1, (char) (this.position.getyCoord()-2));
				allPositions.add(currentPosition);
			}
			if(this.position.getyCoord()+2 >= 0 && this.position.getyCoord()+2 <= this.letter[this.RANGE_OF_BOARD]){
				currentPosition = new ChessPosition(this.position.getxCoord()-1,(char) (this.position.getyCoord()+2));
				allPositions.add(currentPosition);
			}
		}
		
		//5 and 6
		if(this.position.getxCoord() + 1 <= this.RANGE_OF_BOARD){
			
			if(this.position.getyCoord()-2 >= 'A'){				
				currentPosition = new ChessPosition(this.position.getxCoord()+1, (char) (this.position.getyCoord()-2));
				allPositions.add(currentPosition);
			}
			if(this.position.getyCoord()+2 >= 0 && this.position.getyCoord()+2 <= this.letter[this.RANGE_OF_BOARD]){
				currentPosition = new ChessPosition(this.position.getxCoord()+1,(char) (this.position.getyCoord()+2));
				allPositions.add(currentPosition);
			}
		}
		
		//7 and 8
		if(this.position.getxCoord() + 2 <= this.RANGE_OF_BOARD){
			if(this.position.getyCoord()-1 >= 'A'){				
				currentPosition = new ChessPosition(this.position.getxCoord()+2, (char) (this.position.getyCoord()-1));
				allPositions.add(currentPosition);
			}
			System.out.println(this.letter[this.RANGE_OF_BOARD]);
			if(this.position.getyCoord()+1 >= 0 && this.position.getyCoord()+1 <= this.letter[this.RANGE_OF_BOARD]){
				currentPosition = new ChessPosition(this.position.getxCoord()+2,(char) (this.position.getyCoord()+1));
				allPositions.add(currentPosition);
			}
			
		}
		return allPositions;
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

	@Override
	public void outCollection() {
		for (int i = 0; i < allPositions.size(); i++) {
			System.out.print(allPositions.get(i).getxCoord() + " "
					+ allPositions.get(i).getyCoord() + "; ");
		}
		System.out.println();
	}

}
