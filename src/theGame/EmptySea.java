/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */
public class EmptySea extends Ship {
	
	// constructor
	EmptySea() {
		this.length = 1;
		this.hit = new boolean[1]; 
	}
	
	@Override
	String getShipType() {
		return "EmptySea";
	}
	
	@Override
	public String toString(int i, int j) {
		if (this.hit[0]) {
			return "-";
		} else {
			return ".";
		}
	}
	
	@Override
	boolean shootAt(int row, int column) {
		this.hit[0] = true;
		return false;
	}
	
	@Override
	boolean isSunk() {
		return false;
	}

}
