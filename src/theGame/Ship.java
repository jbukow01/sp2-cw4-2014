/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */
public class Ship {
	
	int bowRow;
	int bowColumn;
	int length;
	
	boolean horizontal;
	boolean [] hit = new boolean[4];
	
	// getters
	int getBowRow() {
		return this.bowRow;
	}
	
	int getBowColumn() {
		return this.bowColumn;
	}
	
	boolean isHorizontal() {
		return this.horizontal;
	}
	
	String getShipType() {
		return "type";
	}
	
	int getLength() {
		return this.length;
	}
	
	// setters
	void setBowRow(int row) {
		this.bowRow = row;
	}
	
	void setBowColumn(int column) {
		this.bowColumn = column;
	}
	
	void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}
	
	// instance methods
	boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		if (horizontal) {
			for (int i = 0; i < column + this.getLength(); i++) {
				if (ocean.isOutOfBounds(column, getLength())) {
					return false;
				}
			}
		} else {
			for (int i = 0; i < row + getLength(); i++) {
				if (ocean.isOutOfBounds(row, getLength())) {
					return false;
				}
			}
		}
		return true;
	}
	
	void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		
		setBowRow(row);
		setBowColumn(column);
		setHorizontal(horizontal);
		
		if(horizontal) {
			for (int i = 0; i < this.length; i++) {
				ocean.ships[row][column++] = this;
			}
		} else {
			for (int i = 0; i < this.length; i++) {
				ocean.ships[row++][column] = this;
			}
		}
	}
	
	boolean shootAt(int row, int column) {
		return true;
	}
	
	boolean isSunk() {
		for (int i = 0; i < getLength(); i++) {
			if (!hit[i]) {
				return false;
			}
		}
		return true;
	}

}
