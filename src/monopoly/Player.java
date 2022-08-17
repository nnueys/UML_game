package monopoly;

public class Player {
    private String name;
    private Piece piece;
    private Die[] dice;
    private Board board;

    public void takeTurn() {
        int fvTot = 0;
        for (Die die : dice) {
            die.roll();
            fvTot += die.getFaceValue();
        }

        Square oldLoc = piece.getLocation();
        Square newLoc = board.getSquare(oldLoc, fvTot);
        piece.setLocation(newLoc);
    }
}

