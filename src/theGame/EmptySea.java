/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */
public class EmptySea extends Ship {
	
	boolean hit;
	
	// constructor
	EmptySea() {
		length = 1;
		hit = false; 
	}
	
	@Override
	String getShipType() {
		return "EmptySea";
	}
	
	@Override
	public String toString() {
		if (!hit) {
			return ".";
		} else {
			return "-";
		}
	}
	
	@Override
	boolean shootAt(int row, int column) {
		hit = true;
		return false;
	}
	
	@Override
	boolean isSunk() {
		return false;
	}

}
