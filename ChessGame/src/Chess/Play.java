package Chess;

public class Play {

	public static void main(String[] args) {
		
//		ChessPiece rook = new Rook(3, 'B');
//		System.out.println(rook.getPosition().getxCoord() + " " + rook.getPosition().getyCoord());
//		ChessPiece rook1 = new Rook(7, 'F');
//		System.out.println(rook1.getPosition().getxCoord() + " " + rook1.getPosition().getyCoord());
//		rook.allowedMoves();
//		rook.outCollection();
//		ChessPosition pos = new ChessPosition(7, 'A');
//		System.out.println(rook.captures(pos));
		
		ChessPiece knight = new Knight(6, 'F');
		System.out.println(knight.getPosition().getxCoord() + " " + knight.getPosition().getyCoord());
		knight.allowedMoves();
		knight.outCollection();
		ChessPosition pos = new ChessPosition(7, 'D');
		System.out.println(knight.captures(pos));

	}

}
