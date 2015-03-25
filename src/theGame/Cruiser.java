/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */
public class Cruiser extends Ship {
	
	// constructor
	Cruiser() {
		length = 3;
		hit = new boolean[3]; 
	}
	
	@Override
	String getShipType() {
		return "Cruiser";
	}
	
	@Override
	public String toString() {
		if (isSunk()) {
			return "X";
		} else {
			return "S";
		}
	}

}
