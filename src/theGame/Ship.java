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
			for (int i = 0; i < this.getLength(); i++) {
				if (ocean.isOutOfBounds(column, this.getLength())) {
					return false;
				}
				if (ocean.isOccupied(row, column+i)) {
					return false;
				}
			}
		} else {
			for (int i = 0; i < this.getLength(); i++) {
				if (ocean.isOutOfBounds(row, this.getLength())) {
					return false;
				}
				if (ocean.isOccupied(row+i, column)) {
					return false;
				}
			}
		}
		
		//if (ocean.isSurrounded(row, column, this.getLength())) {
			//return false;
		//}
		
		for(int i = row - 1; i <= row + this.getLength(); i++) {
			for (int j = column - 1; j <= column + this.getLength(); j++ ) {
				if (i >= 0 && i < ocean.oceanSize && j >= 0 && j < ocean.oceanSize) {
						if (ocean.isOccupied(i, j) && ocean.ships[i][j] != this) {
							return false;
					}
				}
			}
		}
		return true;
	}
	
	void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		
		this.setBowRow(row);
		this.setBowColumn(column);
		this.setHorizontal(horizontal);
		
		if(horizontal) {
			for (int i = 0; i < this.length; i++) {
				ocean.ships[row][column+i] = this;
			}
		} else {
			for (int i = 0; i < this.length; i++) {
				ocean.ships[row+i][column] = this;
			}
		}
	}
	
	boolean shootAt(int row, int column) {
		if (!this.isHorizontal()) {
			int tempRow = this.getBowRow();
			if (!this.hit[row - tempRow]) {
				this.hit[row - tempRow] = true;				
			}
		} else {
			int tempColumn = this.getBowColumn();
			if (!this.hit[column - tempColumn]) {
				this.hit[column - tempColumn] = true;				
			}
		}
		return true;
	}
	
	public String toString(int i, int j) {
		return "";
	}
	
	boolean isSunk() {
		for (int i = 0; i < this.getLength(); i++) {
			if (!this.hit[i]) {
				return false;
			}
		}
		return true;
	}

}
