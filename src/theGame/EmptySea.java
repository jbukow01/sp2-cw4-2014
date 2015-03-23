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
		length = 1;
		hit = new boolean[1]; 
	}
	
	@Override
	String getShipType() {
		return "EmptySea";
	}
	
	@Override
	public String toString() {
		return null;
	}
	
	@Override
	boolean shootAt(int row, int column) {
		return false;
	}
	
	@Override
	boolean isSunk() {
		return false;
	}

}
