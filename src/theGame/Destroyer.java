/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */
public class Destroyer extends Ship {
	
	// constructor
	Destroyer() {
		length = 2;
		hit = new boolean[2]; 
	}
	
	@Override
	String getShipType() {
		return "Destroyer";
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
