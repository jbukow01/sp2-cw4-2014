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
	
	boolean horizontalDirection;
	boolean [] hit = new boolean[4];
	
	// getters
	int getBowRow() {
		return bowRow;
	}
	
	int getBowColumn() {
		return bowColumn;
	}
	
	boolean isHorizontal() {
		return horizontalDirection;
	}
	
	String getShipType() {
		return "type";
	}
	
	int getLength() {
		return length;
	}
	
	// setters
	void setBowRow(int row) {
		bowRow = row;
	}
	
	void setBowColumn(int column) {
		bowColumn = column;
	}
	
	void setHorizontal(boolean horizontal) {
		horizontalDirection = horizontal;
	}
	
	// instance methods
	boolean okToPlaceShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		return true;
	}
	
	void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		
		//setBowRow(row);
		//setBowColumn(column);
		//setHorizontal(horizontal);
		
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
