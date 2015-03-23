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
		return bowRow;
	}
	
	int getBowColumn() {
		return bowColumn;
	}
	
	boolean isHorizontal() {
		return horizontal;
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
		//horizontal = horizontal;
	}

}
