package entities;

public class PieceWorkes extends Employee {

	private static final double PIECE_VALUE = 2.0;
	private int pieces;

	public PieceWorkes(String firstName, String lastName, String socialSecurityNumber, int pieces) {
		super(firstName, lastName, socialSecurityNumber);

		if (pieces < 0)
			throw new IllegalArgumentException("Pieces must be >= 0.0");
		this.pieces = pieces;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public double earnings() {
		return pieces * PIECE_VALUE;
	}

	public String toString() {
		return String.format("%s%n%s : %d%n%s : %.2f", super.toString(), "total pieces", getPieces(), "Total earnings",
				earnings());
	}

}
