/**
 * 
 */
package theGame;

/**
 * @author jbukow01
 *
 */
public class Battleship extends Ship {
	
	// constructor
	Battleship() {
		length = 4;
		hit = new boolean[4]; 
	}
	
	@Override
	String getShipType() {
		return "Battleship";
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
